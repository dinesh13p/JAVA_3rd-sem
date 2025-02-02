import java.util.Arrays;

public class DataType {
    public static void main(String[] args) {
        /*
         * Variables: Variables are like containers where values can store ...
         
         * Datatypes: The type of data that variables can
         
         * Java is a Statically Typed language, which means every variables must have
         * specific datatype before use....
         
         // Types of data type
         * 1. Primitive Data: It specifies the type and kind of value it can hold.
         
         The different types of primitive datatypes are given below:
         // a. byte: (Size: 1 byte), (Range: -128 to 127)
         
         */
        byte byteExample = 100;
        System.out.println(byteExample);

        // b. Short: (Size: 2 bytes), (Range: -32,768 to 32,767)
        short shortExample = 32767;
        System.out.println(shortExample);

        // c. int: (Size: 4 bytes), (Range: -2^31 to 2^31-1)
        int intExample = 327679887;
        System.out.println(intExample);

        // d. long: (Size: 8 bytes)
        long longExample = 1234567890L; // (We need to add L at last in long datatype..)
        System.out.println(longExample);

        // e. float: (Store values for decimal points, Sufficient for storing 6 to 7
        // decimal)
        float floatExample = 12.434f;
        System.out.println(floatExample);

        // f. double: (Store values for decimal points, Sufficient for storing 15 to 16
        // decimal)
        double doubleExample = 12.1122d;
        System.out.println(doubleExample);

        // g. boolean: (Stores boolean values either true or false)
        boolean booleanExample = true;
        System.out.println(booleanExample);

        // h. char: (Stores a single character or ASCII values)
        char charExample = 'A';
        char charSecondExample = 97; // a-> 97, A->65
        System.out.println(charExample);
        System.out.println(charSecondExample);



        //Non primitive datatype: These datatypes refers to onjects or arrays
        // 1. String: Sequence of Characters
        String collegeName = "Nepathya college";
        System.out.println(collegeName);
        
        // 2. Array: Collection of elements with same datatype
        int[] arrayOfNumbers = {1,2,43,675};
        System.out.println(Arrays.toString(arrayOfNumbers));

        // 3. Class: Instance of an object
        // 4. Enum: Constants values in object (eg. dropdown in Gender field (male, female))


    }

}
