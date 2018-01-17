package termin13Dezember17;

import java.io.*;

public class StudiengangSplit {

    public static void main(String[] args) {

        try {
            splitStudiengaenge("MatrNr.txt");
        } catch (MatrikelNummerException e) {
            System.out.println(e.getMessage());
        }

    }

    static void splitStudiengaenge(String file) throws MatrikelNummerException {

        try(BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedWriter bwW = new BufferedWriter(new FileWriter("WInfNr.txt"));
            BufferedWriter bwI = new BufferedWriter(new FileWriter("InfNr.txt"));
            BufferedWriter bwE = new BufferedWriter(new FileWriter("ECNr.txt"))) {

            while (true) {
                String matNrStr = br.readLine();

                if(matNrStr == null) {
                    break;
                }

                int matNr = Integer.parseInt(matNrStr);

                if(matNr >= 5000000 && matNr <= 5099999) {
                    bwW.write(matNrStr);
                    bwW.newLine();
                    continue;
                }

                if(matNr >= 5100000 && matNr <= 5199999) {
                    bwI.write(matNrStr);
                    bwI.newLine();
                    continue;
                }

                if(matNr >= 6100000 && matNr <= 6199999) {
                    bwE.write(matNrStr);
                    bwE.newLine();
                    continue;
                }

                throw new MatrikelNummerException();
            }


            bwE.flush();
            bwI.flush();
            bwW.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
