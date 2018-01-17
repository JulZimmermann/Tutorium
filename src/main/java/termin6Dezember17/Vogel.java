package termin6Dezember17;

public abstract class Vogel implements Flugfaehig {


    private int kg;

    Vogel(int kg) {
        this.kg = kg;
    }

    @Override
    public void fliegen() {
        assert (kg < 100);

        System.out.println("Ich fliege");
    }

    public abstract void essen();
}
