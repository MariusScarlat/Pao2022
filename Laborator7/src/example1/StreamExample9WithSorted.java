package example1;

import java.util.stream.Stream;

public class StreamExample9WithSorted {
    public static void main(String[] args) {
        Stream<Cat> catStream = Stream.of(new Cat(1, "Tom"),
                new Cat(5, "Tom1"),
                new Cat(7, "Tom2"),
                new Cat(3, "Tom3"),
                new Cat(0, "Tom4"));

        catStream.sorted().forEach(c-> System.out.println(c.toString()));
    }
}
