package polimorfism;

public class Test {

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.sunet();

        Caine c = (Caine) animal1;
        c.sunet();
        Animal animal2 = new Caine();
        animal2.sunet();

        Animal animal3 = new Pisica();
        animal3.sunet();

//      Castingul merge doar in sus nu si cu clasele paralele sau in jos
//        Animal pisica1 = (Animal)pisica;
//        pisica1.sunet();
//        Caine caine = (Caine)pisica1;

    }
}
