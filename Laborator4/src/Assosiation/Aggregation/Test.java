package Assosiation.Aggregation;

/*
        Mostenirea implica o relatie de tipul is-A
        Asocierea implica o relatie de tipul has-A

        Asocierea este de 2 feluri: Agregare si compozitie.

        Agregare = weak association deoarece obiectele pot exista unul fara altul (Daca sterg employee, adresa mea continua sa existe)
 */
public class Test {

    public static void main(String[] args) {

        Address address1 = new Address("Bucharest", "Romania");
        Employee employee1 = new Employee(1, "Marius", address1);

        employee1.display();
    }
}
