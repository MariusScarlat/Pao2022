package exemplu5;

import exemplu4.Main;

public class Consumer2 extends Thread {

    public Consumer2(String name) {
        super(name);
    }

    public void run() {

        while (true) { //c1 si c2

            synchronized (Main2.bucket) {//bucket este shareuit si de consumeri si de produceri si
                                         //synchronized de bucket va actiona ca un semafor = monitor

                if (!Main.bucket.isEmpty()) {
                    //c1 (din diverse motive, c1 e trecut in waiting)  //c2 care nu este oprit //c1 trece din nou in running
                    int n = Main.bucket.get(0); //c2 ia valoarea de pe pozitia 0
                    Main.bucket.remove(0); //c2 sterge valoarea de pe pozitia 0
                    System.out.println(Thread.currentThread().getName() + " a scos valoarea " + n + " din bucket");
                }
            }
        }
    }
}
