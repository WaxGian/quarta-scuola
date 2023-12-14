import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt");
        Scanner scanner = new Scanner(fr);
        PrintWriter write = new PrintWriter(fw);

        int numero_amici = scanner.nextInt();
        String[] amici = new String[numero_amici];
        for (int i = 0; i < amici.length; i++) {
            amici[i] = "" + scanner.nextInt();
        }

        String prefix = amici[0];
        for (String amico : amici) {
            while (!amico.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 2);
            }
        }
        write.print(prefix.length());

        scanner.close();
        write.close();
    }
}
