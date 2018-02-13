package termin13Februar18.aufgabe1;

public class ComputerBuilder {

    private int seriennummer;
    private String hersteller;
    private int anzahlKerne = 1;
    private Betriebsystem betriebsystem = Betriebsystem.Windows10;

    public ComputerBuilder(int seriennummer, String hersteller) {
        this.seriennummer = seriennummer;
        this.hersteller = hersteller;
    }

    public ComputerBuilder withAnzahLKerne(int anzahLKerne) {
        this.anzahlKerne = anzahLKerne;
        return this;
    }

    public ComputerBuilder withBetriebsystem(Betriebsystem betriebsystem) {
        this.betriebsystem = betriebsystem;
        return this;
    }

    public Computer build() {
        return new Computer(seriennummer, hersteller, anzahlKerne, betriebsystem);
    }

}
