// This is also control statement

public class Assignment2 {
    public static void main(String[] args) {

        // To check whether a person is eligible to vote or not:

        int age = 23;
        if (age >= 18) {
            System.out.println("Eligible to vote!");
        } else {
            System.out.println("Is not eligible to vote!");
        }

        // Simple calculator:
        // System.out.println("Calculator: ");
        // float a = 12;
        // float b = 13;

        // // Operation to perform (+, -, *, /)
        // char operation = '*';

        // float result = 0;

        // switch (operation) {
        // case '+':
        // result = a + b;
        // break;
        // case '-':
        // result = a - b;
        // break;
        // case '*':
        // result = a * b;
        // break;
        // case '/':
        // if (b != 0) {
        // result = a / b;
        // } else {
        // System.out.println("Error: Division by zero!");
        // return;
        // }
        // break;
        // default:
        // System.out.println("Invalid operation!");
        // return;
        // }
        // System.out.println("Result: " + result);

        // Multiplication table of 5:
        System.out.println("Multiplication table of 5: ");
        int number = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        // Print the greatest number among numbers:
        System.out.println("Greatest number among given numbers:");
        int numbers[] = { 12, 13, 45, 54, 32 };
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The greatest number is: " + max);

    }
}