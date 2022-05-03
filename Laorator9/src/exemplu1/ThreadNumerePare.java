package exemplu1;

public class ThreadNumerePare extends Thread {

    @Override
    public void run() {
        for(int i=0; i<=10; i+=2) {
            System.out.println(i + " " + Thread.currentThread().getName() );
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
