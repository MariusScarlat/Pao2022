package exemplu1;

/*
    Interfata functionala a parut cu java 8
    Interfata functionala = interfata care contine O SINGURA metoda abstracta
                          = poate contine oricate metode concrete
    De obicei se adnoteaza cu adnotarea @FunctionalInterface pentru a anunta compilatorul ca aceasta este o interfata functionala si in cazul in care se adauga mai mult
                                    de o metoda abstracta, se va da o eroare de compilare
 */
@FunctionalInterface
public interface FirstFunctionalInterface {

    String sayHello();

//    default void secondMethod() {
//        System.out.println("Metoda concreta");
//    }
}
