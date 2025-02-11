import java.util.Scanner; // Package

public class L5_AskInput {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int intNumber = scanner.nextInt();

        System.out.println("Enter a float number:");
        float floatNumber = scanner.nextFloat();

        System.out.println("Enter a double number:");
        double doubleNumber = scanner.nextDouble();

        System.out.println("\nThe entered integer number is: " + intNumber);
        System.out.println("The entered float number is: " + floatNumber);
        System.out.println("The entered double number is: \n" + doubleNumber);


        scanner.close();
    }
}
