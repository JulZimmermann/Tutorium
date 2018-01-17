package termin10Januar18;

import java.util.Iterator;

public class IteratorMain {

    public static void main(String[] args) {
        DoubleElementList<String> doubleList = new DoubleElementList<>();

        doubleList.add("Hallo");
        doubleList.add("Welt");

        Iterator<String> it = doubleList.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        it.forEachRemaining(IteratorMain::print);

        System.out.println();

        for(String s : doubleList) {
            System.out.println(s);
        }
    }

    public static void print(String str) {
        System.out.println(str);
    }

}
