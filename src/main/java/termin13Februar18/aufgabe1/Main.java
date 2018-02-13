package termin13Februar18.aufgabe1;

public class Main {

    public static void main(String[] args) {

        Computer computer = new ComputerBuilder(100, "IBM")
                .withAnzahLKerne(20)
                .build();

        Programm p = new Programm() {
            @Override
            public void run() {
                ;
            }
        };

        computer.ausfuehren(p);

        computer.ausfuehren(() -> System.out.println("Hallo Welt"));


        computer.ausfuehren(Main::run);

        computer.ausfuehren(new MyProgramm());

    }

    static public void run() {
        System.out.println("Hallo Welt");
    }

    static class MyProgramm implements Programm {

        @Override
        public void run() {
            System.out.println("Hallo Welt");
        }
    }

}
