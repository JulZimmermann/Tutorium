package alt.blatt8.aufgabe4;

public class ParallelProcessorBuilder<T> {

    // Builder mit nur einem optionalen Attribut ist irgendwie Sinnlos.

    private boolean print;
    private int numberOfThreads;
    private Processor<T> processor;
    private T[] data;

    public ParallelProcessorBuilder(boolean print, int numberOfThreads, T[] data) {
        this.print = print;
        this.numberOfThreads = numberOfThreads;
        this.data = data;
    }

    ParallelProcessorBuilder<T> whithProcessor(Processor<T> processor) {
        this.processor = processor;
        return this;
    }

    ParallelProcessor<T> build() {
        if(processor == null && !print) {
            throw new IllegalStateException("ParallelProcessor braucht einen Processor oder muss printen");
        }

        return new ParallelProcessor<>(print, numberOfThreads, processor, data);
    }

}
