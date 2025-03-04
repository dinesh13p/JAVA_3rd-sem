public class RecursionSumOfNIntegerNumbers {

    // Recursive method to calculate the sum of first n integers
    static int sum(int n) {
        if (n == 0) {
            return 0; 
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("The sum of first " + num + " integers is: " + sum(num));
    }
}
