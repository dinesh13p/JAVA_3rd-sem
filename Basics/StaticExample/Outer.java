package StaticExample;

public class Outer {
    static void sayHello(){
        System.out.println("Hello!");
    }

    static class Inner{
        void displayInnerClassDetails(){
            System.out.println("The data is from inner class");
        }
    }
    public static void main(String[] args) {
        Outer.sayHello();

        Outer.Inner InnerClassObject = new Outer.Inner();
        InnerClassObject.displayInnerClassDetails();
    }
}
