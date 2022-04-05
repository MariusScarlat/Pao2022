package exemplu3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exemplu3 {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("A", "B", "C", "D", "E", "F");

        stringList.forEach(s -> System.out.println(s));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "unu");
        map.put(2, "doi");
        map.put(3, "trei");
        map.put(4, "patru");

        map.forEach(
                (key, value) -> System.out.println("The key is " + key + " and the value is " + value)
        );
    }
}
