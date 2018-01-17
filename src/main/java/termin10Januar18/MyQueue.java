package termin10Januar18;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MyQueue<T> implements Iterable<T> {

    private LinkedList<T> list = new LinkedList<>();
    private int max;

    public MyQueue(int max) {
        this.max = max;
    }

    public boolean add(T t) {
        if(list.size() < max) {
            list.add(t);
            return true;
        }

        throw new IllegalStateException("Queue is full");
    }

    public boolean offer(T t) {
        if(list.size() < max) {
            list.add(t);
            return true;
        }

        return false;
    }

    public T remove() {
        if(list.size() > 0) {
            return list.removeFirst();
        }
        throw new NoSuchElementException("Que is empty");
    }

    public T poll() {
        if(list.size() > 0) {
            return list.removeFirst();
        }
        return null;
    }

    public T element() {
        if(list.size() > 0) {
            return list.getFirst();
        }
        throw new NoSuchElementException("Que is empty");
    }

    public T peek() {
        if(list.size() > 0) {
            return list.getFirst();
        }
        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
