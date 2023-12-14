import java.util.ArrayList;

/**
 * Parentesi
 */
public class Parentesi {

    public static String soluzione(char[] input) {

        String openers = "([{<";
        String closures = ")]}>";
        ArrayList<Character> temp = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            if (openers.contains("" + input[i])) {
                temp.add(input[i]);
            }
            if (closures.contains("" + input[i])) {
                int index = closures.indexOf("" + input[i]);
                if (temp.remove(temp.size() - 1) != openers.charAt(index)) {
                    return "malformata";
                }
            }
        }
        if (temp.size() != 0) {
            return "malformata";
        }
        return "giusta";
    }
}