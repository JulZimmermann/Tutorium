package termin20Dezember17.serializableGenerisch;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        handleFilme();
        handleAutos();
    }

    private static void handleFilme() {
        Datenbank<Film> datenbank = new Datenbank<>();

        datenbank.addItem(new Film("ET", "SiFi", "1982"));
        datenbank.addItem(new Film("Forrest Gump", "Literatur", "1994"));

        writeToFile("serializeFilme.txt", datenbank);

        Datenbank<Film> neu = new Datenbank<>();

        readFromFile(Film.class,"serializeFilme.txt", neu);

        for(Film film : neu.getItem()) {
            System.out.println(film.getName());
        }
    }

    private static void handleAutos() {
        Datenbank<Auto> datenbank = new Datenbank<>();

        datenbank.addItem(new Auto(500, "Schwarz"));
        datenbank.addItem(new Auto(600, "Weiß"));

        writeToFile("serializeAutos.txt", datenbank);

        Datenbank<Auto> neu = new Datenbank<>();

        readFromFile(Auto.class,"serializeAutos.txt", neu);

        for(Auto auto : neu.getItem()) {
            System.out.println(auto.getFarbe());
        }
    }

    private static <T extends Serializable> void writeToFile(String file, Datenbank<T> datenbank) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for(T item : datenbank.getItem()) {
                oos.writeObject(item);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static <T extends Serializable> void readFromFile(Class<T> clazz, String file, Datenbank<T> datenbank) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if(clazz.isInstance(obj)) {
                        datenbank.addItem(clazz.cast(obj));
                    }

                } catch (EOFException e) {
                    break;
                }

            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
