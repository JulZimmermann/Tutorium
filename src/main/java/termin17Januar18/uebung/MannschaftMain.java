package termin17Januar18.uebung;

import java.util.*;

public class MannschaftMain {

    public static void main(String[] args) {

        Mannschaft aJugend = new Mannschaft("A Jugend");
        aJugend.addSpieler(new Spieler("Julian", 1));
        aJugend.addSpieler(new Spieler("Heinz", 10));

        Mannschaft bJugend = new Mannschaft("B Jugend");
        bJugend.addSpieler(new Spieler("Michael", 8));
        bJugend.addSpieler(new Spieler("Johannes", 7));

        Map<String, Mannschaft> manschaften = new HashMap<>();
        manschaften.put(aJugend.getName(), aJugend);
        manschaften.put(bJugend.getName(), bJugend);

        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Manschaft: ");
            String name = scanner.nextLine();

            Mannschaft mannschaft = manschaften.get(name);

            if(mannschaft != null) {
                for(Spieler spieler : mannschaft.getSpieler()) {
                    System.out.println(spieler.getName());
                }

                sort(manschaften);
            }

        }

    }

    private static void sort(Map<String, Mannschaft> mannschaftMap) {
        Collection<Mannschaft> manschaftenColl = mannschaftMap.values();
        List<Mannschaft> manschaftenList = new ArrayList(manschaftenColl);
        Collections.sort(manschaftenList);

        for(Mannschaft mannschaft : manschaftenList) {
            System.out.println(mannschaft.getName());
        }

    }

}
