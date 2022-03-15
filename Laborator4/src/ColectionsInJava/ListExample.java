package ColectionsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/*
       Colectii in java: este un framework care ofera o arhitectura pentru a stoca si a manipula un grup de obiecte. Se pot face operatii de : sortare, inserare, cautare, stergere etc

       Avem mai multe interfete: List, Set, Queue, Deque
              -List este interfata care mosteneste Collection
                  -List  are mai multe implementari: ArrayList: -care foloseste un arra dinamic pentru a stoca elementele. Se pot stoca elemente duplicate.
                                                                -Mentine ordinea de inserare  si nu este sincronizata
                                                                -obiectele pot fi accesate random
                                                    LinkedList: lista inlantuita
 */
public class ListExample {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        //afisare
        System.out.println(integerList);
        System.out.println("================");
        for(int i : integerList) {
            System.out.println(i);
        }
        System.out.println("================");
        for(int i=0; i<integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
        System.out.println("================");
        Iterator iterator = integerList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================");

        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("a");
        stringList.add("a");
        for(String s: stringList) {
            System.out.println(s);
        }

        System.out.println("================");
        stringList.remove("a");
        for(String s: stringList) {
            System.out.println(s);
        }

        System.out.println(stringList.contains("b"));


        stringList.stream().forEach(s -> System.out.println(s));

    }
}
