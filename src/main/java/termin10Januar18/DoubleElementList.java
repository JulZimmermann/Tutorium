package termin10Januar18;

import java.util.ArrayList;
import java.util.Iterator;

public class DoubleElementList<T> extends ArrayList<T> {

    @Override
    public boolean add(T t) {
        return super.add(t) && super.add(t);
    }

    @Override
    public void add(int index, T element) {
        super.add(index, element);
        super.add(index, element);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private int count = 0;

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override
            public boolean hasNext() {
                return count < size();
            }

            @Override
            public T next() {
                return get(count++);
            }
        };
    }
}
