import java.util.*;

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

public class StudentSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name, age, and grade: ");
            students[i] = new Student(sc.next(), sc.nextInt(), sc.nextDouble());
        }

        Arrays.sort(students, (a, b) -> Double.compare(b.grade, a.grade));
        System.out.println("\nTop Student:");
        students[0].display();

        System.out.println("\nAll Students:");
        for (Student s : students)
            s.display();
            sc.close();
    }
}
