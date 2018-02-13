package termin13Februar18.aufgabe1;

public class Computer {

    private int seriennummer;
    private String hersteller;
    private int anzahlKerne;
    private Betriebsystem betriebsystem;

    public Computer(int seriennummer, String hersteller, int anzahlKerne, Betriebsystem betriebsystem) {
        this.seriennummer = seriennummer;
        this.hersteller = hersteller;
        this.anzahlKerne = anzahlKerne;
        this.betriebsystem = betriebsystem;
    }

    public void ausfuehren(Programm programm) {
        for(int i = 0; i < anzahlKerne; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        if(betriebsystem == Betriebsystem.WindowsXP) {
                            Thread.sleep(5000);
                        }
                        if(betriebsystem == Betriebsystem.Windows10) {
                            Thread.sleep(100);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    programm.run();
                }
            }).start();
        }
    }

}
