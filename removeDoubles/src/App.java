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

        int size = scanner.nextInt();
        int[] input = new int[size];
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }
        int[] result = Frasson.removeDouble(input);
        for (int i : result) {
            write.print(i + " ");
        }

        scanner.close();
        write.close();
    }
}
