package exceptions.RuntimeExceptionsExample;

public class RuntimeExceptionCatch {

    public static void main(String[] args) {

        try{
            int a = 10;
            int b = a/0;
        } catch (java.lang.ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Final");
        }
    }
}
