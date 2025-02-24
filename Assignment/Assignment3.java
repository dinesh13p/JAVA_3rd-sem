import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc_second = new Scanner(System.in);

        // Ask a character from the user
        System.out.println("Enter a character");
        char chr = sc.next().charAt(0);
        System.out.println("Character = " + chr);

        // Ask a Word from the user
        System.out.println("Enter a name");
        String name = sc.next();
        System.out.println("Name = " + name);

        // Ask a Sentence ("Java is a programming language") from the user
        System.out.println("Enter full name");
        String fullName = sc_second.nextLine();
        System.out.println("FullName = " + fullName);
        sc.close();
        sc_second.close();

    }
}
