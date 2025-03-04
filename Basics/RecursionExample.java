public class RecursionExample {

    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 0) {
            return 1; // base case
        }
        return n * factorial(n - 1); // Recursive case
    }

    // Recursive method to print fibonacci series
    static int fibonacci(int a) {
        // if(a == 0 || a == 1){
        if (a <= 1) {
            return a;
        }
        return fibonacci(a - 1) + fibonacci(a - 2);
    }

    // Recursive method to calculate sum of n integer numbers
    static int sum(int n) {
        if (n == 0) {
            return 0; 
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        // Recursion : calling itself
        // Recursion consist of :
        // 1. Recursive case : calling itself
        // 2. Base case: Stopping condition

        System.out.println(factorial(4));

        int num = 5;
        System.out.println("The factorial of " + num + " is: " + factorial(num));

        System.out.println("\nFibonacci series: ");
        for (int i = 0; i <= 8; i++)
            System.out.print("  " + fibonacci(i));

        System.out.println();
        System.out.println();
        System.out.println("The sum of first " + num + " integers is: " + sum(num));

    }
}
