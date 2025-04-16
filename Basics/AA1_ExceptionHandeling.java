public class AA1_ExceptionHandeling {
    public static void main(String[] args) {
        int a = -1;
        int b = 0;
        try{
        int result = a/b;
        System.out.println(result);
        }
        catch(ArithmeticException exception){
        System.out.println("Cannot divide by zero");
        }
    System.out.println("After exception handeling.........");
    }
}
