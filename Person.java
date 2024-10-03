import java.util.Scanner;

class Person {
    public String name;
    private int age;

    public Person(name, age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
