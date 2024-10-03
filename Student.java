import java.util.Scanner;

class Student extends Person {
    private String major;

    public Student(name, age, major) {
        super(name, age);
        this.major = scanner.nextLine();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
    }
}
