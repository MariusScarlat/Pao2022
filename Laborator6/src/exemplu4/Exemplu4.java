package exemplu4;

public class Exemplu4 {

    void doSomething() {
        System.out.println("Do something");
    }

    public static void main(String[] args) {

        Exemplu4 exemplu4 = new Exemplu4();

        FunctionalInterfaceExample functionalInterfaceExample = exemplu4::doSomething;

        functionalInterfaceExample.display();
    }
}
