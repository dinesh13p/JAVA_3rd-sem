import java.util.Scanner;

public class L9_FunctionExample {

    static int addition(int a, int b){
        return a + b;
    }

    static int multiplication(int c, int d, int e){
        return c * d * e;
    }

    static int division(int i, int j){
        return i / j;
    }
    public static void main(String[] args) {


        //Addition
        int firstResult = addition(10, 12);
        int secondResult = addition(16, 33);
        System.out.println("First result is: " + firstResult);
        System.out.println("Seconf result is: " + secondResult);


        //Multiplication
        Scanner multiply = new Scanner(System.in);
        System.out.print("Enter three numbers to multiply: ");

        int c = multiply.nextInt();
        int d = multiply.nextInt();
        int e = multiply.nextInt();
        // int firstMultiply = multiplication(12, 8, 2);

        // int multiplyResult = c * d * e;
        int multiplyResult = multiplication(c, d, e);
        System.out.println("Multiplication of given three numbers: "+ multiplyResult);
        multiply.close();

        
        //Division
        Scanner divide = new Scanner(System.in);
        System.out.print("Enter two numbers to divide: ");

        int i = divide.nextInt();
        int j = divide.nextInt();
        
        int divideResult = division(i, j);
        System.out.println("Multiplication of given three numbers: "+ divideResult);
        divide.close();



    }
}


// Commennt multiply when trying to run division.