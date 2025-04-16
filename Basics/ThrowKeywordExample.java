import CustomException.CustomErrorException;

public class ThrowKeywordExample {

    public static void main(String[] args) {
        int number = 10;
         try{
            if (number < 0){
                throw new CustomErrorException("Number cannot be negative");
            }
            System.out.println("Valid number: " + number);
         } catch(Exception exception){
            System.out.println("Custom error: " + exception.getMessage());
         } finally{
            System.out.println("Cleaning resources.......");
         }
    }
    
}