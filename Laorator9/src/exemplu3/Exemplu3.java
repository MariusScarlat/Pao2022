package exemplu3;

public class Exemplu3 {

    public static void main(String[] args) {
        /*
            Avem 2 baze de date si se executa 2 query-uri pe ele
            Primul query dureaza 3 secunde
            Al doilea query dureaza 2 secunde
            timp = 3 + 2 = 5 secunde
            Stiu ca query-urile respective sunt total independente unul de altul
            Putem face 2 thread uri separate care sa ruleze in paralel
            timpul in cazul acesta ar fi max(3,2) = 3


            Dupa aceste 2 query-uri trebuie sa se faca anumite procesari pe baza datelor obtiunite in urma query-urilor

            TREBUIE sa ma asigur ca mai intai se executa query-urile si apoi se face procesarea
         */

        RunnableDB1 db1 = new RunnableDB1();
        RunnableDB2 db2 = new RunnableDB2();

        Thread t1 = new Thread(db1, "DB1 THREAD");
        Thread t2 = new Thread(db2, "DB2 THREAD");

        t1.start();
        t2.start();
        // join blocheaza threadul principal pana la finalizarea threadul t1 si t2
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.out.println(Thread.currentThread().getName() + " PROCESSING......");


    }
}
