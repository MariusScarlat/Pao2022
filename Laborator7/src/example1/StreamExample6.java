package example1;

import java.util.List;
import java.util.stream.Collectors;

public class StreamExample6 {
    public static void main(String[] args) {
        List<String> list = List.of("abcd",  "efgh", "nsada", "asd");
        //new StringBuilder(String x).reverse()

        //var x
        List<StringBuilder> x = list.stream()
                     .map(s -> new StringBuilder(s).reverse())
                     .collect(Collectors.toList());

        System.out.println(x);

    }
}
