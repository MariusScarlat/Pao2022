package exemplu4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> bucket = new ArrayList<>();

    public static void main(String[] args) {
        Producer  p1 = new Producer("PRODUCER 1");
        Producer  p2 = new Producer("PRODUCER 2");

        Consumer c1 = new Consumer("CONSUMER 1");
        Consumer c2 = new Consumer("CONSUMER 2");

        p1.start();
        p2.start();

        c1.start();
        c2.start();
    }
}
