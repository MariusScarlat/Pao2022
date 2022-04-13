package example1;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamExample2 {

    public static void main(String[] args) {
        //sursa finita
        Stream<Integer> stream1 = Stream.empty();
        Stream<Integer> stream2 = Stream.of(1,2,7,1,11,13);

        //sursa infinita
        Supplier<Integer> supplier = () -> new Random().nextInt();
        Stream<Integer> stream3 = Stream.generate(supplier);

        stream3.limit(10).forEach(x-> System.out.println(x));
    }
}
