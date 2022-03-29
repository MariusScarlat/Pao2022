package exceptions.ExceptionExample;

public class ContBancar {

    static int bani = 100;

    public void retrageBani(int a) throws InsufficientFoundsException {
        if (a > bani) {
            throw new InsufficientFoundsException("Not enough money");
        } else {
            bani = bani - a;
        }
    }

    public void retrageBaniExemplu() throws InsufficientFoundsException {
        retrageBani(120);

    }
}
