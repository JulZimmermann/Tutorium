package termin13Februar18.aufgabe2;

public class Main {

    public static void main(String[] args) {

        MountainBike bike = new MountainBike(30);
        bike.schalten(20);

        Fahrrad doppelBike = new FahrradDoppler(bike);

        doppelBike.fahren();
    }

}
