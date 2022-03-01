package SingletonPattern;


/*
        Singleton Pattern: Design Pattern
                          putem avea o singura instanta a unei clase
 */
public class SingletonObject {

    private static SingletonObject instance;

    private SingletonObject() {}

    public static SingletonObject getInstance() {
        //aici se face verificare daca obiectul a fost creat deja
        if (instance == null) {
            instance = new SingletonObject();
        }
        return instance;
    }


}
