import java.io.*;
import java.util.*;

public class preftel2 {
    public static void main(String[] args) throws IOException {
        FileReader r = new FileReader("input.txt");
        FileWriter w = new FileWriter("output.txt");
        Scanner in = new Scanner(r);
        PrintWriter out = new PrintWriter(w);
        int n = in.nextInt();
        int s = 0;
        ArrayList<String> numbs = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            numbs.add("" + in.nextInt());
            s = numbs.get(i).length();
        }
        Collections.sort(numbs);

        int pref = 0;
        for (int i = 0; i < s; i++) {
            int a = (numbs.get(0)).charAt(i);
            int b = (numbs.get(n - 1)).charAt(i);
            if (a == b) {
                pref++;
                continue;
            }
            break;
        }

        out.print(pref);

        in.close();
        out.close();
    }
}