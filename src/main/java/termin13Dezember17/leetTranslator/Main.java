package termin13Dezember17.leetTranslator;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        final String file = "leet.txt";

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             LeetWriter lw = new LeetWriter(new FileWriter("leet.txt"))) {

            while(true) {
                System.out.print("Einagbe: ");
                String in = br.readLine();
                lw.write(in);
                lw.write("\n");
                lw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
