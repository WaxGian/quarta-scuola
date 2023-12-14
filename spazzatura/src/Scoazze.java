import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Scoazze {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt");
        Scanner scanner = new Scanner(fr);
        PrintWriter write = new PrintWriter(fw);

        int numero_cestini = scanner.nextInt();
        int numero_giorni = scanner.nextInt();

        Cestino[] cestini = new Cestino[numero_cestini];
        for (int i = 0; i < cestini.length; i++) {
            cestini[i] = new Cestino(scanner.nextInt(), numero_giorni);
        }
        for (int i = 0; i < numero_giorni; i++) {
            cestini[scanner.nextInt()].add(scanner.nextInt());
        }

        int costo_totale = 0;
        for (int i = 0; i < cestini.length; i++) {
            costo_totale += cestini[i].calcolaCosto();
        }

        write.print(costo_totale);

        scanner.close();
        write.close();
    }
}
