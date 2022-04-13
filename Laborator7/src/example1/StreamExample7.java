package example1;

import java.util.List;

public class StreamExample7 {

    public static void main(String[] args) {


        /*
        map(Function) => Stream -> Stream
        mapToInt(ToIntFunction) => Stream -> IntStream
        mapToLong(ToLongFunction) => Stream -> LongStream
        mapToString(ToStringFunction) => Stream -> StringStream
        mapToDouble(ToDoubleFunction) => Stream -> DoubleStream
         */

        List<String> list = List.of("abasda", "asdadsa", "asda", "1231");

        long x = list.stream()
                    .mapToInt(s -> s.length()) //transformam streamul din tipul String in Integer
                    .mapToObj(s -> s) //Integer Stream => Stream
                    .mapToInt((s -> s)) //Stream => Integer Stream
                    .sum();

        System.out.println(x);

    }
}
