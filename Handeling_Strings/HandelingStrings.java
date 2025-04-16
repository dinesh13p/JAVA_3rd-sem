public class HandelingStrings {
    public static void main(String[] args) {
        // Concatenation
        String firstName = "Dinesh";
        String lastName = "Poudel";
        String fullname = firstName + " " + lastName;
        System.out.println("Concatenation Example: FullName: " + fullname);
        System.out.println(" ");

        int number = 123;
        String stringNumber = String.valueOf(number);
        System.out.println(stringNumber.getClass().getName());
        System.out.println(" ");

        String mixedcase = "Hello World";
        System.out.println("Upper Case: "+ mixedcase.toUpperCase());
        System.out.println("Lower Case: "+ mixedcase.toLowerCase());
        System.out.println(" ");

        // Extracting characters
        String name = "Programming";
        char firstCharacter = name.charAt(0);
        char fifthCharacter = name.charAt(4);
        System.out.println("First character: "+ firstCharacter);
        System.out.println("fifth character: "+ fifthCharacter);
        System.out.println(" ");

        // String Comparison
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = "java";
        // Using ==
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("s1 == s2 ? " + (s1 == s2));
        System.out.println("s1 == s3 ? " + (s1 == s3));
        // Using .equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase(s4));

        // Searching Strings
        String text = "Java is a programming language";
        // Check if contains
        System.out.println("Contains programming: " + ("programming"));
        // Index of string occurrence
        int firstIndex = text.indexOf("Java");
        System.out.println("First ''");

        // Nepathya College
    }
}
