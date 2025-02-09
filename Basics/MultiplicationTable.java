import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        
    // Multiplication table of given number

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        scan.close();
    }
}