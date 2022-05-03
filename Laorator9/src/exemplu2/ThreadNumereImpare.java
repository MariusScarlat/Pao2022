package exemplu2;

public class ThreadNumereImpare implements Runnable {

    @Override
    public void run() {
        for(int i=1; i<=10; i+=2) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
