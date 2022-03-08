package interfete;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;

/*
        Interfata = colectie de metode abstracte. O clasa implementeaza o interfata prin cuvantul cheie implements
                                                  O clasa poate implementa oricate interfete
                   -pot avea metode concrete  folosind cuvantul cheie default (metoda concreta = metoda care are implementare = are body)
                   -by default, toate metodele dintr-o interfata sunt abstracte
                   -atributele dintr-o interfata sunt by default: publice, statice si finale
                   -interfetele se extind intre ele prin cuvantul cheie extends. O interfata poate extinde oricate interfete

        Interfata vs clasa abstracta:

          In interfata atributele sunt publicte statice si finale by default.
          O interfata arata ce stie sa faca un obiect iar o clasa arata ce este un obiect.
          O clasa poate implementa oricate interfete dar poate mosteni o singura clasa.


 */
public interface Animal {

    public static final int varsta = 5;
    int numarPicioare = 4;

    public abstract void sunet();
    void poateMerge();

    default void alDoileaSunet() {
        System.out.println("SUNET!");
    }

}
