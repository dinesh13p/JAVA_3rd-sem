import java.util.Scanner;

public class A5_SimpleInterest {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        double Principle = scanner.nextDouble();

        System.out.print("Enter Rate: ");
        double Rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double Time = scanner.nextDouble();

        double SimpleInterest = (Principle * Time * Rate) / 100;
        System.out.println("The Simple interest is: "+ SimpleInterest);
        scanner.close();
    }
    

    
}
