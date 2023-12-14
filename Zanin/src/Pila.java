import java.util.*;

public class Pila {
    public static void main(String[] args) {
        ArrayList<Integer> pila = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < pila.size(); i++) {
            int a = in.nextInt();
            for (int j = 0; j < pila.size(); j++) {
                if (j == 0) {
                    pila.add(a);
                }
                if (a < pila.get(j) && a >= pila.get(j + 1)) {
                    pila.add(a);
                }
            }
        }
        in.close();
    }
}