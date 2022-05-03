package exemplu4;

import java.util.Random;

public class Producer extends Thread {

    public Producer(String name) {
        super(name);
    }

    public void  run() {

        Random random = new Random();
        while(true) {
            if(Main.bucket.size() < 100) {
                int n = random.nextInt(1000); // valori de la 0 la 999;
                Main.bucket.add(n);
                System.out.println(Thread.currentThread().getName() + " a adaugat valoarea" + n + " in bucket");
            }
        }
    }
}
