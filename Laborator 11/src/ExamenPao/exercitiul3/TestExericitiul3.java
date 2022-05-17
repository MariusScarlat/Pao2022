package ExamenPao.exercitiul3;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class TestExericitiul3 {

    public static void main(String[] args) {

        BiFunction<Persoana, Double, Double> biFunction = (p,m) -> p.getSalariu() * (1 + m/100.0);
        //unde m este un numar de la 0 la 100.0
        //eu dau de la tastatura persoana1 si m = 50.0
        //pentru persoana 1 : biFunction = 100.0 *  ( 1 + 1/2) unde m = 50.0 => 150.0

        BiPredicate<Double, Double> biPredicate = (s,m) -> s <= m; //in cazul in care salariul persoanei < este sub numarul m dat de la tastatura o sa se returneze true

        BiConsumer<Persoana, Double> biConsumer = (p,m) -> p.setSalariu(p.getSalariu() * (1 + m/100.0));

        //


        Persoana persoana1 = new Persoana(200.0, "Vasile", 40);
        Persoana persoana2 = new Persoana(50.0, "Ion", 30);
        Persoana persoana3 = new Persoana(10.0, "Ilie", 25);

        List<Persoana> list = Arrays.asList(persoana1, persoana2, persoana3);

        list.stream() // persoana1: salariu 100.0, "Vasile, 40.....persoana2: salariu 50.0, "Ion", 30.......persoana3.....
            .filter(persoana -> persoana.getVarsta() > 35)     //dupa aceasta filtrare o sa am doar persoana1: salariu 100.0, "Vasile, 40



            .filter(persoana -> biPredicate.test(biFunction.apply(persoana, 50.0), 200.0)) //filter ca si metoda primeste un predicate
                //dupa aceasta filtrare vom avea o singura persoana din nou persoana1: salariu 100.0, "Vasile, 40
            .forEach(p -> biConsumer.accept(p, 50.0));
            //salariu 150.0, "Vasile, 40


        //
        System.out.println(list);

        for(int i=0; i<list.size(); i++) {
            if(list.get(i).getVarsta()>35) {
                if(biFunction.apply(list.get(i), 50.0) > 200.0) {
                    list.get(i).setSalariu(biFunction.apply(list.get(i), 50.0));
                }
            }
        }









    }
}
