public class MethodOverloading {

    static int add (int a, int b){
        return a + b;
    }

    static double add (double a, double b){
        return a + b;
    }

    static int add (int a, int b, int c){
        return a + b + c;
    }

    


    public static void main(String[] args) {
        int result = add(12, 13);
        System.out.println("Addition int numbers: "+ result );

        double answer = add(14, 16);
        System.out.println("Addition double numbers: "+ answer);


    }    
}


// int add (int a, int b)
// double add (double a, double b)
// int add (int a, int b, int c)