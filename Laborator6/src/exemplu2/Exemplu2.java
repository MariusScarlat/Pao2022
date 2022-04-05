package exemplu2;

public class Exemplu2 {

    public static void main(String[] args) {

        SecondFunctionalInterface secondFunctionalInterface = (nr) -> nr + 5;

        System.out.println(secondFunctionalInterface.incrementNumber(5));

    }
}
