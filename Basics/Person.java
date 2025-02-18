public class Person {

    // Data Members
    String name;
    int age;
    float salary;

    // Parametarized Constructor
    Person(String _name, int _age, float _salary){
        this.name = _name;
        this.age = _age;
        this.salary = _salary;
    }

    void displayPersonDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
        System.out.println("Salary: "+ salary);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Kishor", 25, 69000);
        person1.displayPersonDetails();

        Person person2 = new Person("Hari", 21, 36000);
        person2.displayPersonDetails();
    }
    
}
