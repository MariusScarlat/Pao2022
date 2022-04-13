package example1;

import java.util.List;

public class StreamExample3 {
    //operatii finale:
    //allMatch
    //anyMatch
    //noneMatch
    public static void main(String[] args) {

        List<Integer> list = List.of(1,5,6,3,8,9);

        boolean b1 = list.stream().allMatch(x -> x % 2 == 0); //false
        boolean b2 = list.stream().anyMatch(x -> x % 2 == 0); //true
        boolean b3 = list.stream().noneMatch(x -> x % 2 == 0); //false

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }
}
