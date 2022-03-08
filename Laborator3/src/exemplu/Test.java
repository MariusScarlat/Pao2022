package exemplu;

public class Test {
    public static void main(String[] args) {
        A a1 = new B();
        //se va apela atributul din A deoarece se iau atributele din tipul in care se stocheaza adresa
        //se va apela metoda din tipul obiectului creat in memorie (B)
        System.out.println(a1.x);
        a1.m();
        a1.n();


        B b1 = new B();
        System.out.println(b1.x);
        b1.m();
        b1.n();
    }
}
