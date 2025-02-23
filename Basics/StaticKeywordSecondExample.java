public class StaticKeywordSecondExample {
    
    String employeeName;
    static String employeeCEO;  // Static variable shared across all instances
    double employeeSalary;

    void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee CEO: " + employeeCEO);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        StaticKeywordSecondExample object1 = new StaticKeywordSecondExample();
        StaticKeywordSecondExample object2 = new StaticKeywordSecondExample();
       
        StaticKeywordSecondExample.employeeCEO = "Hari";

        object1.employeeName = "Ram";
        object1.employeeSalary = 13000;

       
        object2.employeeName = "Sita";
        object2.employeeSalary = 15000;

        object1.displayDetails();
        object2.displayDetails();
    }
}
