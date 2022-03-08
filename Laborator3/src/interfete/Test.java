package interfete;

/*
PROIECT:
ETAPA I : 30 martie (25% din punctajul total)
 */
public class Test {
    public static void main(String[] args) {
        Caine caine = new Caine();
        caine.poateMerge();
        caine.sunet();

        System.out.println(Animal.numarPicioare);
        System.out.println(Animal.varsta);
        caine.alDoileaSunet();

        Animal a1 = new Caine();
        a1.alDoileaSunet();
        a1.poateMerge();
        a1.sunet();

    }
}
