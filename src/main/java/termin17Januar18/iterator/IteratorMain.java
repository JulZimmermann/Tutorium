package termin17Januar18.iterator;

public class IteratorMain {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();
        for(int i = 0; i < 100; i++) {
            list.add(i);
        }

        for(int i = 0; i < 100; i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        for(Integer integer : list) {
            System.out.println(integer);
        }

    }

}
