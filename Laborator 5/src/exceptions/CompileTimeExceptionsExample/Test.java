package exceptions.CompileTimeExceptionsExample;

public class Test {

    public static void main(String[] args) {

        ThrowExceptionExample throwExceptionExample = new ThrowExceptionExample();


        try {
            throwExceptionExample.m();
        }
        catch (MariusCheckedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
