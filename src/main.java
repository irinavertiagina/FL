public class main {
    static String main = "ONE";

    public main() {
        System.out.println("TWO");
    }

    public static void main(String [] args) {
        main m = new main();
        System.out.println(m);
    }

    public static void main() {
        System.out.println(main);
    }
}