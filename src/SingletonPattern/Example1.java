package SingletonPattern;

public class Example1 {

    public static void main(String[] args) {

        SingletonObject singletonObject = SingletonObject.getInstance();
        System.out.println(singletonObject);

        SingletonObject singletonObject1 = SingletonObject.getInstance();
        System.out.println(singletonObject1);

        SingletonObject singletonObject2 = SingletonObject.getInstance();
        System.out.println(singletonObject2);


    }
}
