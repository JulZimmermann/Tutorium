package termin10Januar18;

import java.util.ArrayList;
import java.util.List;

public class Live {

    public static void main(String[] args) {

       List<Auto> al = new ArrayList<>(10);

       for(int i = 0; i < al.size(); i++) {
           System.out.println(al.get(i).seriennummer);
       }

       for(Auto a : al) {
           System.out.println(a.seriennummer);
       }


    }

}
