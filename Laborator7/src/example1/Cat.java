package example1;

public class Cat implements Comparable<Cat>{

    int age;
    String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Cat cat) {
        return this.age - cat.age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
