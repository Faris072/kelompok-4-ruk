import java.util.Scanner;

class Person {
    public String name;
    private int age;

    public Person(name, age) {
        this.name = name;
        this.age = age;
    }

    /*
        - YAGNI -

        fungsi displayInfo tidak pernah di gunakan baik di class main ataupun selain main.
        method displayInfo ini hanya untuk override pada class turunannya saja.
        pembentukan object person sendiri tidak pernah dilakukan di main, displayInfo hanya untuk override. 
        seharusnya dihapus saja
    */
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
