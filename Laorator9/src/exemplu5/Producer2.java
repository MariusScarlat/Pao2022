package exemplu5;

import exemplu4.Main;

import java.util.Random;

public class Producer2 extends Thread {

    public Producer2(String name) {
        super(name);
    }

    public void  run() {

        Random random = new Random();
        while(true) {

            synchronized (Main2.bucket) {
                if (Main.bucket.size() < 100) {

                    int n = random.nextInt(1000); // valori de la 0 la 999;
                    Main.bucket.add(n);
                    System.out.println(Thread.currentThread().getName() + " a adaugat valoarea" + n + " in bucket");
                }
            }
        }
    }
}
