package exemplu2;

public class Exemplu2 {

    public static void main(String[] args) {
        //In momentul imi care imi creez un nou thread folosind interfata Runnable
        //trebuie sa creez o instanta a clasei care a implementat interfata Runnable
        //apoi trebuie sa pun instanta respectiva a clasei intr-o instata de Thread
        ThreadNumereImpare threadNumereImpare = new ThreadNumereImpare();

        Thread t1 = new Thread(threadNumereImpare, "ThreadNumereImpare 1");
        Thread t2 = new Thread(threadNumereImpare, "ThreadNumereImpare 2");
        t1.start();
        t2.start();

        System.out.println(Thread.currentThread().getName() + " END OF PROGRAM ");

    }
}
