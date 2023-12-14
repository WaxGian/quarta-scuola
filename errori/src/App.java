public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Counter clock = new Counter();
        clock.incr();
        System.out.println(clock.getValue());
    }
}
