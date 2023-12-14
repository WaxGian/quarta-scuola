import java.util.HashMap;
import java.util.Iterator;

/**
 * Frasson
 */
public class Frasson {

    public static int[] removeDouble(int[] input) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number : input) {
            map.put(number, null);
        }
        int[] result = new int[map.size()];
        Iterator<Integer> iterate = map.keySet().iterator();
        for (int i = 0; i < result.length; i++) {
            result[i] = iterate.next();
        }
        return result;
    }
}