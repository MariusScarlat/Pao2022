package Static;

public class Example1 {

    public static void main(String[] args) {

        StaticExample staticExample;

        staticExample = new StaticExample();
        staticExample.text = "Hello";
        System.out.println(staticExample.number);

        StaticExample staticExample1 = new StaticExample();
        StaticExample.number = 10;


        System.out.println(staticExample.number);
        System.out.println(staticExample1.number);

    }
}
