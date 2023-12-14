public class Counter {
    private static int val;

    public void incr() {
        val++;
    }

    public void reset() {
        val = 0;
    }

    public int getValue() {
        return val;
    }
}
