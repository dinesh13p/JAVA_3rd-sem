import java.util.Scanner;

public class L6_LoopingStatements {
    public static void main(String[] args) {
        
        //While loop
        // Scanner scanner = new Scanner(System.in);
        // int enterNumber;

        // while(true){
        //     System.out.println("Enter the number: ");
        //     enterNumber = scanner.nextInt();

        //     if (enterNumber == 5){
        //         System.out.println("Exiting ...");
        //         break;
        //     }
        // }
        // scanner.close();
        

        //do while loop
        Scanner dowhile = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter the number: ");
            number = dowhile.nextInt();
        } while (number != 5); 

        System.out.println("Exiting...");
        dowhile.close();
    }
}
