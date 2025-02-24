import java.util.Scanner;

public class A6_SimpleInterestUsingStaticKeyword {
    
    // Static method
    static double calculateSimpleInterest(double principle, double rate, double time) {
        return (principle * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principle: ");
        double principle = scanner.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = scanner.nextDouble();

        // Calling the static method
        double simpleInterest = calculateSimpleInterest(principle, rate, time);
        
        System.out.println("The Simple Interest is: " + simpleInterest);

        scanner.close();
    }
}

    
