package termin24Januar18;

import java.util.Comparator;

public class Baum {

    private Node start;

    public void add(String str) {
        if(start == null) {
            start = new Node(str);
        } else {

            Node before = null;
            Node curent = start;
            while (curent != null) {
                if(curent.value.compareTo(str) < 0) {
                    before = curent;
                    curent = curent.right;
                } else {
                    before = curent;
                    curent = curent.left;
                }
            }

            if(before.value.compareTo(str) < 0) {
                before.right = new Node(str);
            } else {
                before.left = new Node(str);
            }

        }
    }

    private static class Node{

        Node(String value) {
            this.value = value;
        }

        Node left;
        Node right;
        String value;

    }


}
