package alt.blatt8.aufgabe4;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        // Erstellt ein Array mit Integern von 1 bis 100
        Integer[] data = IntStream.range(1, 1001).boxed().toArray(Integer[]::new);

        ParallelProcessor<Integer> parallelProcessor = new ParallelProcessorBuilder<>(true, data.length, data)
                                                            .whithProcessor(i -> 2*i)
                                                            .build();

        parallelProcessor.start();

        // Die Werte in data sind jetzt alle verdoppelt

    }

}
