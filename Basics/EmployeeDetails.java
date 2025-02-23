public class EmployeeDetails {
    
    int id;
    String name;
    float salary;

    // Parametarized Constructor
    EmployeeDetails(int _ID, String _name, float _salary){
        this.id = _ID;
        this.name = _name;
        this.salary = _salary;
    }

    

    //Method
    double calculateBonus(){
        return salary * 0.1;
    }

    void displayEmployeeDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee salary NPR: " + salary);
        System.out.println("Bonous salary: NPR" + calculateBonus());
    }

    public static void main(String[] args) {
        EmployeeDetails employeeDetails = new EmployeeDetails(1001, "Thor", 4000);
        employeeDetails.displayEmployeeDetails();
    }


}
