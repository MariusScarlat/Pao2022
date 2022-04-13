package example1;

import java.util.List;

//map Este folosita pentru a schimba tipul unui Stream
public class StreamExample5 {

    public static void main(String[] args) {

        List<String> list = List.of("abcd",  "efgh", "nsada", "asd");

        //suma lungimii elementelor din list
        var x = list.stream() //"abcd",  "efgh", "nsada", "asd"
                    .map(s -> s.length())//4 4 5 3
                    //.forEach(s -> System.out.println(s));
                    .reduce(0, (a,b) -> a + b); //cand t = 0, a = 0 => b = 4; a = 4; b = 4; => 4 + 4 = 8; a = 8; b = 5 ...
        System.out.println(x);
//        ASA NU
//        var  y;
//
//        y = "Sout"

        // ASA DA
        // var y = "SOUT";
    }
}
