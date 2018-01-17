package termin13Dezember17;

import termin13Dezember17.decorator.Auto;
import termin13Dezember17.decorator.Fahrbar;
import termin13Dezember17.decorator.Motorrad;
import termin13Dezember17.decorator.SportFahrbar;
import termin13Dezember17.exceptions.UngueltigesZielException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {
            throw new UngueltigesZielException("Würzburg");
        } catch(UngueltigesZielException e) {
            System.out.println("Ungültiges Ziel: " + e.getZiel());
        }

        Fahrbar sportAuto = new SportFahrbar(new Auto());
        Fahrbar sportMotorrad = new SportFahrbar(new Motorrad());


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new FileReader("text.txt"));

    }

}
