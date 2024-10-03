import java.util.Scanner;

class Teacher extends Person {
    private String subject;
     // Melanggar Konsep Clean Code SRP (Single Responsibility), karena class Teacher menangani input, seharusnya hanya attribute dan method
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject =  subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}
