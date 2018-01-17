package termin6Dezember17;

public class RaubVogel extends Vogel {

    boolean fett;

    RaubVogel(int kg) {
        super(kg);
        this.fett = true;
    }

    @Override
    public void essen() {
        essen(12);
    }


    public void essen(int wert) {
        if(wert > 0 && wert < 11) {
            wert = wert/0;
        } else {
            throw new IllegalArgumentException("Ungültiger Wert!");
        }
    }

}
