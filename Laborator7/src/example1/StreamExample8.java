package example1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample8 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,2,6,3,1,123,3,12321,12321,6876,4,21,1,0,2,4,5,7,8,9);
        List<Integer> list1 = new ArrayList<>();

        for(int i : list) {
            if(!list1.contains(i)) {
                list1.add(i);
            }
        }
        System.out.println(list1);

        var list2 = list.stream()
                        .distinct()
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(list2);
    }
}
