package example1;

import exampleOfException.CheckedExceptionExample;

import java.util.List;

public class StreamExample4 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,6,3,3,2,1,8);

        list.stream()
                //operatii  intermediare
            .forEach(x-> {
                try {
                    m(x);
                }
                  catch (CheckedExceptionExample e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            });


    }

    static void m(int x) throws CheckedExceptionExample {
        if(x % 2 == 0) {
            throw new CheckedExceptionExample("My Custom Exception");
        } else {
            System.out.println("Do something");
        }
    }
}
