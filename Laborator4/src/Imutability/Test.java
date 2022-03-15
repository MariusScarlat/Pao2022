package Imutability;

public class Test {

    public static void main(String[] args) {

        ImmutableExample immutableExample1 = new ImmutableExample("Da", 1);
        ImmutableExample immutableExample2 = new ImmutableExample("Nu", 2);

        System.out.println(immutableExample1.getId());
        System.out.println(immutableExample1.getName());

        System.out.println(immutableExample2.getName());
        System.out.println(immutableExample2.getId());
    }
}
