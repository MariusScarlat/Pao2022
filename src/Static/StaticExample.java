package Static;

public class StaticExample {

    /*
            static = cuvant cheie care se foloseste pe metode si atribute si pe blocuri de cod
                   = in momentul in care un atribut este static, el nu mai tine de instanta, tine de clasa (= o sa fie un atribut care este impartit de toate instantele clasei respective)
                   = daca o metoda este statica, la fel, nu o sa mai fie de instanta, o sa fie de clasa
                   = o metoda statica nu poate fi suprascrisa

     */

    static int number = 5;
    String text;

    static void printMessage() {
        System.out.println("Hello World!");
    }
}
