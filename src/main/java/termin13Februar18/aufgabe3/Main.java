package termin13Februar18.aufgabe3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Haus> haueser = create();

        serialize(haueser);

        List<Haus> haueserNew = deserialize();

        for(Haus haus : haueserNew) {
            System.out.println(haus.adresse);
            for(Raum raum : haus) {
                System.out.println(raum.getBezeichnung());
            }
            System.out.println();
        }

    }

    static List<Haus> create() {
        Raum a = new Raum("Wohnzimmer", 0);
        Raum b = new Raum("Küche", 0);

        List<Raum> raueme1 = new ArrayList<>();

        raueme1.add(a);
        raueme1.add(b);

        Haus h1 = new Haus(raueme1, "Zwergweg 1", "Müller");

        Raum c = new Raum("Wohnzimmer", 0);

        List<Raum> raueme2 = new ArrayList<>();

        raueme2.add(c);

        Haus h2 = new Haus(raueme2, "Zwergweg 2", "Meier");

        List<Haus> haueser = new ArrayList<>();
        haueser.add(h1);
        haueser.add(h2);

        return haueser;
    }

    static void serialize(List<Haus> haueser) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"))) {

            for(Haus haus : haueser) {
                oos.writeObject(haus);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static List<Haus> deserialize() {

        List<Haus> haueser = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.txt"))) {

            boolean eof = false;
            while (!eof) {
                try {
                    Object o = ois.readObject();

                    if(o instanceof Haus) {
                        haueser.add((Haus)o);
                    }
                } catch (EOFException | ClassNotFoundException e) {
                    eof = true;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return haueser;
    }

}
