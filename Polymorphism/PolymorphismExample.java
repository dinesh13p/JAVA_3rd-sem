public class PolymorphismExample {
    
    // Method Overloading
    // Example:
    // 1. int add(int a, int b);
    // 2. int add(int a, int b, int c);
    // 3. double add(double a, double b, double c);

    // Polymorphism: Having multiple forms

    int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        
        int result = add(12, 13, 21);
        System.out.println("Addition of three numbers: " + result);

        PolymorphismExample polymorphismExample = new PolymorphismExample();

        int intnumbers = polymorphismExample.add(10, 20); // for first int add variable
        double doublenumbers = polymorphismExample.add(5.5, 6.5);

        polymorphismExample.answer(intnumbers, doublenumbers);
    }

    void answer(int intnumbers, double doublenumbers) {
        System.out.println("Addition of two numbers: " + intnumbers);
        System.out.println("Addition of two double numbers: " + doublenumbers);
    }
}
