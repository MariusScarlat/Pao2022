package Assosiation.Aggregation;

public class Employee {

    int id;
    String name;
    Address empAddress;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.empAddress = address;
        this.name = name;
    }

    public void display() {
        System.out.println("Emp Id: " + id);
        System.out.println("Emp Name: " + name);
        System.out.println("Emp Addres: " + empAddress.toString());
    }

}
