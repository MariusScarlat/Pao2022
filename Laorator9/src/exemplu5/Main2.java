package exemplu5;

import exemplu4.Consumer;
import exemplu4.Producer;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    //pentru a rezolva probleme de concurenta, trebuie sa sincronizam threadurile
    // aveam cuvantul cheie synchronized
    //synchronized = pus pe un bloc de cod, face ca acel bloc de cod sa fie blocat pana la terminarea threadului care il executa
    // daca pun synchronized pe o metoda si va fi accesata de un thread t1, threadul t2 nu va putea accesa methoda sychronized pana ce t1 nu se va fi terminat


    public static List<Integer> bucket = new ArrayList<>();

    public static void main(String[] args) {
        Producer  p1 = new Producer("PRODUCER 1");
        Producer  p2 = new Producer("PRODUCER 2");

        Consumer c1 = new Consumer("CONSUMER 1");
        Consumer c2 = new Consumer("CONSUMER 2");

        p1.start();
        p2.start();

        c1.start();
        c2.start();
    }
}
