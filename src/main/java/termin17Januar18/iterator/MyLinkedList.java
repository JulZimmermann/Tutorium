package termin17Januar18.iterator;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {

    private MyLinkedNode<T> start;
    private int size;

    public T get(int index) {
        checkBonds(index);

        return findNodeByIndex(index).data;
    }
    
    public void add(T item) {
        if(size == 0) {
            start = new MyLinkedNode<>(item);
        } else {
            MyLinkedNode<T> last = findNodeByIndex(size - 1);
            last.next = new MyLinkedNode<>(item);
        }

        size++;
    }

    public void remove(int index) {
        checkBonds(index);

        if(index == 0) {
            start = start.next;
        } else {
            MyLinkedNode<T> before = findNodeByIndex(index - 1);
            before.next = before.next.next;
        }
    }

    private MyLinkedNode<T> findNodeByIndex(int index) {
        MyLinkedNode<T> currentNode = start;
        int count = 0;

        for(int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    private void checkBonds(int index) {
        if(index < 0 || index > size-1) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<T>() {
            MyLinkedNode<T> currentNode = start;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                T data = currentNode.data;
                currentNode = currentNode.next;

                return data;
            }
        };

    }

    private static class MyLinkedNode<T> {
        T data;
        MyLinkedNode<T> next;

        MyLinkedNode(T data) {
            this.data = data;
        }
    }

}
