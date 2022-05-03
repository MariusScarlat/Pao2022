package exemplu4;

public class Consumer extends Thread {

    public Consumer(String name) {
        super(name);
    }

    public void run() {
        while(true) { //c1 si c2
            if(!Main.bucket.isEmpty()) { //c1 (din diverse motive, c1 e trecut in waiting)  //c2 care nu este oprit //c1 trece din nou in running
                int n = Main.bucket.get(0); //c2 ia valoarea de pe pozitia 0
                Main.bucket.remove(0); //c2 sterge valoarea de pe pozitia 0
                System.out.println(Thread.currentThread().getName() + " a scos valoarea " + n + " din bucket");
            }
        }
    }
}
