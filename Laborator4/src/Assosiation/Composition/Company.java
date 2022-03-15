package Assosiation.Composition;

import java.util.ArrayList;
import java.util.List;

/*
        Cuvantul cheie final -pus in fata unei clase  => clasa nu mai poate fi mostenita
                            -pus in fata unui atribut => atributul devine constant (in momentul in care i-a fost atribuita o valoare, acesta nu mai poate fi modificat)
                            -pus in fata unei metode => metoda nu mai poate fi suprascrisa
       final in fata unui atribut: pot sa ii dau valoarea fie direct (dupa egal) sau in constructor
 */
public class Company {
    String name;

    private final List<Office> offices;

    public Company(String name, List<Office> offices) {
        this.name = name;
        this.offices = offices;
    }

    public List<Office> getOffices() {
        return offices;
    }


}
