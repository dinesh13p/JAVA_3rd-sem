public class L10_ConstructorExample {

    // Default Constructor
    L10_ConstructorExample() {
        System.out.println("Constructor called!");
    }

    public static void main(String[] args) {
        // Creating an object, which automatically calls the constructor
        L10_ConstructorExample constructorExample = new L10_ConstructorExample();
    
    }
}

/*
 * Constructor
 * 
 * A constructor is a special method that is automatically called when an instance (object) is created.
 * - It has the same name as the class.
 * - It does not have a return type (not even void).
 * - If no constructor is defined, Java provides a default constructor.
 */
