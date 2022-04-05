package exemplu5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestForStreamsApi {


    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A", "B", "C", "D", "E", "F");

        List<String> stringList2 = new ArrayList<>();

        for(String s : stringList) {
            stringList2.add(s.toLowerCase());
        }

        System.out.println(stringList2);


        //stream() = deschide un flux de date pe baza listei pe care noi am dat-o
        //un stream are 3 elemente:
        // operatie de deschidere(stream())
        //operatii intermediare (in cazul nostru map()) si pot avea oricate operatii intermediare
        //operatie de inchidere (in momentul in care am inchis un stream, nu il mai pot deschide)
        List<String> stringList3 = stringList.stream()
                                             .map(s -> s.toLowerCase())
                                             .collect(Collectors.toList());

        List<Integer> list = stringList.stream()
                                       .map(s-> s.length())
                                        .collect(Collectors.toList());

        List<Integer> list2 = list.stream()
                                  .map(i -> i+5)
                                  .collect(Collectors.toList());
        System.out.println(list2);

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9);
        for(int i : integerList) {
             if(i % 2 == 0) {
                 System.out.println(i);
             }
        }

        integerList.stream()
                   .filter(i -> i % 2 == 0)
                   .forEach(i -> System.out.println(i));

    }


}
