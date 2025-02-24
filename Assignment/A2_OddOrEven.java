import java.util.Scanner;

public class A2_OddOrEven {
    public static void main(String[] args) {
        // Check whether number is odd or even
        Scanner check = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = check.nextInt();

        if(a % 2 == 0 ){
            System.out.println("The given number is even ");
        }
        else{
            System.out.println("The given number is odd");
        }
        check.close();
    }
}
