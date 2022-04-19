package Example5;

public class Test1 {

    public static void main(String[] args) {
        m(n());

    }

    static void m(String message) {
        System.out.println(message);
           }

    static String n() {
        System.out.println("S-a apelat metoda n");
        return "Hello from N";
    }
}
