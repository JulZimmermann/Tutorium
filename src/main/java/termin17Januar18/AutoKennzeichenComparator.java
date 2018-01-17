package termin17Januar18;

import java.util.Comparator;

public class AutoKennzeichenComparator implements Comparator<Auto> {

    @Override
    public int compare(Auto o1, Auto o2) {
        return o1.kennzeichen.compareTo(o2.kennzeichen);
    }

}
