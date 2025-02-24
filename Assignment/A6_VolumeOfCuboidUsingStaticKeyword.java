import java.util.Scanner;

public class A6_VolumeOfCuboidUsingStaticKeyword {

    static double length, width, height;

    // Static method
    static double calculateVolume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length: ");
        length = scanner.nextDouble();

        System.out.print("Enter Width: ");
        width = scanner.nextDouble();

        System.out.print("Enter Height: ");
        height = scanner.nextDouble();

        // displaying the volume
        System.out.println("The volume of the cuboid is: " + calculateVolume());

        scanner.close();
    }
}
