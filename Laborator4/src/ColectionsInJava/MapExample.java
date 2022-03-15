package ColectionsInJava;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
        Map este o interfata separata de Collection.(nu au nicio treaba)
                - Este e colectie care stocheaza elemente de tip (key, value)
                - Un map nu accepta chei duplicate (pot fi valori duplicate dar pentru chei diferite)
                Implementari: HashMap care accepta o cheie nul. Nu mentine nicio ordine de inserare
                              LinkedHashMap care mosteneste Map si care mentine ordinea de inserare
 */
public class MapExample {

    public static void main(String[] args) {

        //Map< Tipul cheii,  Tipul valorii> map = new HashMap<>();
        Map<Integer, String> map = new HashMap<>();
        //adaugare cu metoda put

        map.put(1, "a");
        map.put(2, "b");
        map.put(1, "c");
        map.put(2, "d");

//        System.out.println(map);

        Set set = map.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + " value: " + entry.getValue());
        }

        Set set2 = map.keySet();

        System.out.println(set2);
        for(Object object : set2) {
            System.out.println("key: " + object + " value: "+ map.get(object));
        }

    }
}
