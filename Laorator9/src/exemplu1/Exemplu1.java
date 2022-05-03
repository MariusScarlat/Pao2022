package exemplu1;
/*
    Threaduri = fire de executie = (un set de instructiuni care se executa in pararlel cu threadul principal al unei aplicatii)

    In java avem 2 metode de a crea un thread:
        1.Se extinde clasa Thread
        2.Se implementeaza interfata Runnable

        Dupa ce am extins/implementat Thread/Runnable se suprascrie metoda run.
        Metoda run = locul unde se scriu setul de instructiuni care se va executa in threadul creat

        Pentru a porni un thread folosim metoda start !!!!!
        Daca apelez run, nu se va crea un nou thread ci doar se va executa metoda run


    Thread's life cylce:

          NEW: in momentul in care s-a instantiat
          NEW -----start() -----> RUNNABLE
          RUNNABLE = threadul este intr-o stare in care poate fi luat in considerare de catre procesor sa fie executat(=procesorul are resursele necesare sa ruleze threadul nostru creat)
          RUNNABLE ------in momentul in care procesorul are resurse--------> RUNNING
          RUNNING = threadul se executa
          RUNNING -----final de executie----> DEAD/TERMINATED
          DEAD/TERMINATED = threadul s-a terminat


          SAU

          RUNNING ----sleep(), wait() ----> WAITING
          WAITING ----> RUNNABLE ----> RUNNING

        In cazul in care se intampla ceva cu threadul cand acesta este in waiting, se arunca InterruptedException



 */
public class Exemplu1 {

    public static void main(String[] args) {
        ThreadNumerePare threadNumerePare = new ThreadNumerePare(); //este in life cycle-ul de new

        threadNumerePare.start(); //RUNNABLE

        System.out.println("END " + Thread.currentThread().getName());
    }
}
