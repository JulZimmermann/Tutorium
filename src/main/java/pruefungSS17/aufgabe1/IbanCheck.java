package pruefungSS17.aufgabe1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class IbanCheck {

    public static boolean ibanCheck(String iban) throws FalscheIBANException {

        if(iban.charAt(0) != 'D' || iban.charAt(1) != 'E' || iban.length() != 22) {
            throw new FalscheIBANException("IBAN " + iban + " ist ungültig");
        }

        return true;
    }

    public void ibanAusDateiLesen(String file) throws FalscheIBANException {

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {

            while(br.ready()) {
                ibanCheck(br.readLine());
            }

            System.out.println("Iban checks erfolgreich");

        } catch (FileNotFoundException e) {
            System.out.printf("Datei %s nicht gefunden%n", file);
        } catch (IOException e) {
            System.out.printf("Fehler beim Lesevorgang von Datei: %s%n", file);
        } catch (NullPointerException e) {
            System.out.printf("Datei %s existiert nicht%n", file);
        }

    }

    public void dateienTest(String[] files) {
        for(String file : files) {
            try {
                ibanAusDateiLesen(file);
            } catch (FalscheIBANException e) {
                System.out.println(file);
            }
        }
    }

}
