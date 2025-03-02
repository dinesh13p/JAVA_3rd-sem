public class RecursionExample {

    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 0) {
            return 1; // base case
        }
        return n * factorial(n - 1); // Recursive case
    }

    static int fibonacci(int a) {
        if (a <= 1) {
            return a;
        }
        return fibonacci(a - 1) + fibonacci(a - 2);
    }

    public static void main(String[] args) {
        // Recursion : calling itself
        // Recursion consist of :
        // 1. Recursive case : calling itself
        // 2. Base case: Stopping condition

        System.out.println(factorial(4));

        int num = 5;
        System.out.println("The factorial of " + num + " is: " + factorial(num));

        System.out.println("Fibonacci series: ");
        for (int i = 0; i <= 8; i++)
            System.out.print("  " + fibonacci(i));

    }
}
