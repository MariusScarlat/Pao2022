package example1;

import java.util.List;

//Streams API
/*
    nu aduc performanta in aplicatie, doar devine mai citibil codul, mai usor de mentinut
    Daca devine prea complicat streamul, se prefera sa nu mai fie folosit
 */
public class StreamExample1 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,4,3,2,9,3,2,1);

//        for(int i=0; i<list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
//        list.stream().forEach(x-> System.out.println(x));

        list.stream() // 1 4 3 2 9 3 2 1
            .filter(x -> x%2==0) // 4 2 2
            .forEach(x-> System.out.println(x)); //4 2 2

    }
}


//Un stream este alcatuit din: sursa + operatii intermediare + operatie finala
//sursa poate fi finita/infinita
// pot genera streamuri pe baza unei colectii (in cazul nostru lista) sau folosind clasa Stream
//pot avea oricate operatii intermediare
// pot avea o singura operatie finala/terminala. In momentul in care un stream este inchis, acesta nu mai poate fi deschis.