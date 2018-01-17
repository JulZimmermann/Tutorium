package termin6Dezember17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HalloWelt {

    public static void main(String[] args) throws IOException {
        System.out.println("Hallo Welt");


        Vogel xy = new RaubVogel(23);

        xy.essen();

    }

}
