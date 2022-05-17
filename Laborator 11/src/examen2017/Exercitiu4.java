package examen2017;

public class Exercitiu4 {

    public static void main(String[] args) {

        B a = new B();

        System.out.println(a.f(1));
        // metoda f din A este statica deci nu poate fi suprascrisa => f din A



        System.out.println(a.g(3));
        // metoda g din B suprascrie metoda g din A deci va fi folosita cea din B

        System.out.println(a.f(1) + a.g(3));
    }
}
