package termin13Februar18.aufgabe2;

public class MountainBike extends Fahrrad {


    private int anzahlGaenge;
    private int aktuellerGang = 1;

    public MountainBike(int anzahlGaenge) {
        this.anzahlGaenge = anzahlGaenge;
    }

    public void schalten(int gang) {
        if(gang > anzahlGaenge) {
            throw new IllegalArgumentException("Ungültiger Gang!");
        }

        aktuellerGang = gang;
    }

    @Override
    public void fahren() {
        System.out.printf("Ich fahre im %d. Gang%n", aktuellerGang);
    }


}
