public class Calculator {

    public static void main(String[] args) {

        System.out.println("Calculator: ");

        float a = 12;
        float b = 13;

        char operation = '*';

        float result;

        switch (operation) {
            case '+': // Addition
                result = a + b;
                break;
            case '-': // Substraction
                result = a - b;
                break;
            case '*': // Multiplication
                result = a * b;
                break;
            case '/': // Division
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid!");
                return;
        }
        System.out.println("Result: " + result);
    }

}
