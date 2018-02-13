package termin13Februar18.aufgabe2;

public class FahrradDoppler extends Fahrrad {

    private Fahrrad fahrrad;

    public FahrradDoppler(Fahrrad fahrrad) {
        this.fahrrad = fahrrad;
    }

    @Override
    public void fahren() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                fahrrad.fahren();
            }
        };

        new Thread(r).start();
        new Thread(r).start();
    }
}
