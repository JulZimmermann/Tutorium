package alt.blatt8.aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class ParallelProcessor<T> {

    private boolean print;
    private int numberOfThreads;
    private Processor<T> processor;
    private T[] data;

    public ParallelProcessor(boolean print, int numberOfThreads, Processor<T> processor, T[] data) {
        this.print = print;
        this.numberOfThreads = numberOfThreads;
        this.processor = processor;
        this.data = data;
    }

    public void start() {
        // Die Aufgabenstellung gibt nicht an, was gemacht werden soll,
        // wenn data.length > numberOfThreads.
        // Ich habe mich dazu entschieden die restlichen Elemente sequenziel abzuarbeiten.

        runParallelPart();
        runSequenziellPart();
    }

    private void runParallelPart() {
        List<Thread> threads = new ArrayList<>();

        for(int i = 0; i < Math.min(data.length, numberOfThreads); i++) {
            final int j = i; // Nötig, weil Java dumm ist

            Thread thread = new Thread(() -> processElement(j));

            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void runSequenziellPart() {
        for(int i = Math.min(data.length, numberOfThreads); i < data.length; i++) {
            processElement(i);
        }
    }

    private void processElement(int index) {
        if(print) {
            System.out.println(data[index]);
        }

        if(processor != null) {
            T newValue = processor.process(data[index]);
            data[index] = newValue;
        }

    }

}
