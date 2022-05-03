package exemplu3;

public class RunnableDB1 implements Runnable{

    @Override
    public void run() {
        System.out.println("QUERY ON DB1.......");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
