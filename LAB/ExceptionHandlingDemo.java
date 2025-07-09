public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception : Division by zero is not allowed.");
        } finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("Program continues after exception handling.");
    }
}
