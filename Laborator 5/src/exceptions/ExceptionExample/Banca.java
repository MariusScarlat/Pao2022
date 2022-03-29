package exceptions.ExceptionExample;

public class Banca {

    public static void main(String[] args) {

        ContBancar contBancar = new ContBancar();

        try {
            contBancar.retrageBani(50);
            System.out.println(ContBancar.bani);

            contBancar.retrageBani(100);
            System.out.println(ContBancar.bani);
        } catch (InsufficientFoundsException e) {
            e.printStackTrace();
        }
        try{
            contBancar.retrageBaniExemplu();
        } catch (InsufficientFoundsException e) {
            e.printStackTrace();
        }
    }
}
