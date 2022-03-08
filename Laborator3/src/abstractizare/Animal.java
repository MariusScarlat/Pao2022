package abstractizare;

/*
        clasa abstracta nu poate fi instantiata si are metode abstracte dar si metode concrete
        are cuvantul cheie abstract in semnatura
 */
public abstract class Animal {

    abstract void sunet();

    void altSunet() {
        System.out.println("Din interiorul metodei concrete din clasa abstracta");
    }
}
