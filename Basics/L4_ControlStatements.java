public class L4_ControlStatements {
    // Control statements: Conditional statements, looping statements;

// 1.Conditional statements:
// if, if-else, if-elseif-else,switch 

// 2.Looping statements:
// for,while,do-while

// 3.break and continue


    
    public static void main(String[] args) {
        
        int age = 20;
        if (age >= 18) {
            System.out.println("Eligible to vote!");
        } else {
            System.out.println("Not eligible to vote!");
        }



        int num = 0;
        if (num > 0) {
            System.out.println("Positive!");
        } else if (num == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Negative");
        }


        
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
