package example1;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExample10WithSorted {

    public static void main(String[] args) {

        Stream<Dog> dogStream = Stream.of(new Dog(1,"Dog1"),
                new Dog(9,"Dog2"),
                new Dog(7,"Dog3"),
                new Dog(14,"Dog4"),
                new Dog(12,"Dog5"),
                new Dog(10,"Dog6"),
                new Dog(11,"Dog7"));

        Comparator<Dog> dogComparator = (dog1, dog2) -> dog2.age - dog1.age;
        dogStream.sorted(dogComparator).forEach(d -> System.out.println(d.toString()));
    }
}
