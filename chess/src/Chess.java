import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Chess {
    public static void main(String[] args) throws IOException {
        FileReader re = new FileReader("input.txt");
        FileWriter w = new FileWriter("output.txt");
        Scanner scanner = new Scanner(re);
        PrintWriter write = new PrintWriter(w);
        int k = scanner.nextInt();
        System.out.println("" + k);
        int n[] = new int[k - 1];
        int r[] = new int[k - 1];
        int t[] = new int[k - 1];
        int sum = 0;
        for (int i = 0; i < k - 1; i++) {
            n[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
            t[i] = scanner.nextInt();
            int s[] = new int[n[i]];
            for (int j = 0; j < n[i] - 1; j++) {
                s[j] = scanner.nextInt();
                sum = +s[j];
            }
            if (r[i] + s[i] > (sum / n[i])) {
                System.out.println("Cheater");
            } else
                System.out.println("Innocent");
        }
        scanner.close();
        write.close();
    }
}