public class L13_PassByValue{
    public static void main(String[] args){
        int a = 10;
        System.out.println(a);

        int b;
        b = a;// b is initialized with the copy of the value of a
        System.out.println(b);
        b = 50;
        System.out.println(b);
        System.out.println(a);
    }
}