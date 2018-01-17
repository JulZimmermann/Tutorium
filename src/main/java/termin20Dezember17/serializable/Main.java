package termin20Dezember17.serializable;

import java.io.*;

public class Main {

    public static void handleAutos() {
        FilmDatenbank datenbank = new FilmDatenbank();

        datenbank.addFilm(new Film("ET", "SiFi", "1982"));
        datenbank.addFilm(new Film("Forrest Gump", "Literatur", "1994"));

        writeToFile("serialize.txt", datenbank);

        FilmDatenbank neu = new FilmDatenbank();

        readFromFile("serialize.txt", neu);

        for(Film auto : neu.getFilme()) {
            System.out.println(auto.getName());
        }
    }

    private static void writeToFile(String file, FilmDatenbank datenbank) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for(Film film : datenbank.getFilme()) {
                oos.writeObject(film);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFromFile(String file, FilmDatenbank datenbank) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            while (true) {
                try {
                    Film item = (Film) ois.readObject();
                    datenbank.addFilm(item);
                } catch (EOFException e) {
                    break;
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }



}
