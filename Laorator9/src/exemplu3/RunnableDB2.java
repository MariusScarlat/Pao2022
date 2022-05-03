package exemplu3;

public class RunnableDB2 implements Runnable {

    public void run() {
        System.out.println("QUERY ON DB2.....");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
