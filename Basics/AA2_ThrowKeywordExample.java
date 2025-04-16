// Throws keyword

public class AA2_ThrowKeywordExample {
    // Deveoper A
    public static int divide(int a, int b) throws ArithmeticException{
        return a / b;
    }

    public static void main(String[] args) {
        // Developer B
        try {
            int result = divide(1, 0);
            System.out.println(result);
        } catch (Exception exception) {
            System.out.println("Cannot divide by zero");
        }
    }
}
