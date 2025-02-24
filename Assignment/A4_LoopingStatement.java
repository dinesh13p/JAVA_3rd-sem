import java.util.Scanner;

public class A4_LoopingStatement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Sum of the first N natural numbers using for loop

        System.out.print("Enter N for sum: ");
        int N = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + N + " natural numbers: " + sum);

        System.out.println("-------------------------------------------");


        // 2. Print all even numbers between 1 and 50 using while loop
        System.out.println("Even numbers between 1 and 50:");
        int num = 2;
        while (num <= 50) {
            System.out.print(num + " ");
            num += 2;
        }
        System.out.println();
        System.out.println("-------------------------------------------");


        // // 3. Print numbers from 100 to 1 in reverse order using while loop
        System.out.println("Numbers from 100 to 1 in reverse order:");
        num = 100;
        while (num >= 1) {
            System.out.print(num + " ");
            num--;
        }
        System.out.println();
        System.out.println("-------------------------------------------");


        // // 4. Find the factorial of a number N using for loop
        System.out.print("Enter a number N for factorial: ");
        N = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= N; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + N + " is: " + factorial);
        System.out.println("-------------------------------");


        // // 5. Print the first N Fibonacci numbers using for loop
        // System.out.print("Enter N for Fibonacci sequence: ");
        // N = scanner.nextInt();
        // int a = 0, b = 1, next;
        // System.out.print("First " + N + " Fibonacci numbers: " + a + " " + b);
        // for (int i = 2; i < N; i++) {
        //     next = a + b;
        //     System.out.print(" " + next);
        //     a = b;
        //     b = next;
        // }
        // System.out.println();
        // System.out.println("--------------------------------------");


        // // 6. Reverse the digits of a number using a while loop
        // System.out.print("Enter a number to reverse: ");
        // int number = scanner.nextInt();
        // int reversed = 0;
        // while (number != 0) {
        //     int digit = number % 10;
        //     reversed = reversed * 10 + digit;
        //     number /= 10;
        // }
        // System.out.println("Reversed number: " + reversed);

        // System.out.println("--------------------------------");


        // // 7. Find the largest digit in a given number using while loop
        // System.out.print("Enter a number to find the largest digit: ");
        // number = scanner.nextInt();
        // int largestDigit = 0;
        // while (number != 0) {
        //     int digit = number % 10;
        //     if (digit > largestDigit) {
        //         largestDigit = digit;
        //     }
        //     number /= 10;
        // }
        // System.out.println("Largest digit: " + largestDigit);

        scanner.close();
    }
}
