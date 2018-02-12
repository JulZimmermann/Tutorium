package termin17Januar18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableMain {

    public static void main(String[] args) {

        Auto a1 = new Auto();
        a1.ps = 80;

        Auto a2 = new Auto();
        a2.ps = 200;

        int i = a1.compareTo(a2);


        List<Auto> autos = new ArrayList<>();

        autos.add(a2);
        autos.add(a1);

        Collections.sort(autos);
        Collections.sort(autos, Comparator.comparing(a -> a.kennzeichen));
    }

}
