public class Student {

    // Data Members
    String name;
    int rollNumber;
    float marks;

    // Parametarized Constructor
    Student(String _name, int _rollNumber, float _marks){
        this.name = _name;
        this.rollNumber = _rollNumber;
        this.marks = _marks;
    }

    void Result(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ rollNumber);
        System.out.println("Salary: "+ marks);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Kishor", 24, 55);
        student1.Result();

        Student student2 = new Student("Hari", 32, 60);
        student2.Result();
    }
    
}
