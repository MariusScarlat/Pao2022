package abstractizare;

public class Test {

    public static void main(String[] args) {
        Animal animal1 = new Caine();
        animal1.sunet();
        animal1.altSunet();

        Caine animal2 = new Caine();
        animal2.sunet();
        animal2.altSunet();
    }
}
