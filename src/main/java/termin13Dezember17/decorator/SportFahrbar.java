package termin13Dezember17.decorator;

public class SportFahrbar implements Fahrbar {

    private Fahrbar fahrbar;

    public SportFahrbar(Fahrbar fahrbar) {
        this.fahrbar = fahrbar;
    }

    @Override
    public void fahren() {
        System.out.println("Ich bin so schnell");
        fahrbar.fahren();
    }

}
