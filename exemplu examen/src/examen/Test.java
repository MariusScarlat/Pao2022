package examen;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        Automobil a1 = new Automobil("BMW", "Seria1", 2000.0, 15000);
        Automobil a2 = new Automobil("BMW", "Seria2", 2000.0, 4000);
        Automobil a3 = new Automobil("BMW", "Seria3", 2000.0, 17000);
        Automobil a4 = new Automobil("BMW", "Seria4", 2500.0, 18000);
        Automobil a5 = new Automobil("Audi", "A1", 4000.0, 4500);

        List<Automobil> automobilList = new ArrayList<>();
        automobilList.add(a1);
        automobilList.add(a2);
        automobilList.add(a3);
        automobilList.add(a4);
        automobilList.add(a5);

    /*
    afișați automobilele care costă cel puțin 5000€, în ordinea descrescătoare a prețurilor;
     */

        Comparator<Automobil> comparator = new Comparator<Automobil>() {
            public int compare(Automobil a1, Automobil a2) {
                return a2.getPret() - a1.getPret();
            }
        };

        automobilList.stream()
                     .filter(automobil -> automobil.getPret() >= 5000)
                     .sorted(comparator)
                     .forEach(automobil -> System.out.println(automobil));

        /*
        afișați mărcile distincte de automobile
         */

        System.out.println("==========================================");

        automobilList.stream()
                     .map(automobil -> automobil.getMarca()) //din obiectul automobil am obtinut doar Stringul de marca
                     .distinct()
                     .forEach(automobil -> System.out.println(automobil));

        System.out.println("==========================================");

        /*
        creați o listă formată din automobilele care au capacitatea cilindrică cuprinsă între 2000 și 3000 cm3;
         */

        var list = automobilList.stream()
                                .filter(automobil -> (automobil.getCapacitate() >= 2000.0) && (automobil.getCapacitate() <= 3000.0))
                                .collect(Collectors.toList());
        System.out.println(list);

        // TEMA: Urmatorul punct de la problema

    }
}
