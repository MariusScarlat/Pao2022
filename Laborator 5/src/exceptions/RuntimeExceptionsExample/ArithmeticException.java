package exceptions.RuntimeExceptionsExample;

public class ArithmeticException {

    public static void main(String[] args) {

        int a = 10;
//        throw new MariusException("Marius Exception");
        int b = a/0;
        System.out.println("Final");
    }
}
