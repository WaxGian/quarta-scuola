
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("input.txt");
        FileWriter fw = new FileWriter("output.txt");
        Scanner scanner = new Scanner(fr);
        PrintWriter write = new PrintWriter(fw);

        char[] input = scanner.nextLine().toCharArray();
        System.out.println(Parentesi.soluzione(input));
        scanner.close();
        write.close();
    }
}