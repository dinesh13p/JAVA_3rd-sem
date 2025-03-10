public class L16_CommandLineSI {
    public static void main(String[] args) {
        double P = Double.parseDouble(args[0]);
        double R = Double.parseDouble(args[1]);
        double T = Double.parseDouble(args[2]);

        double SI = (P * R * T) / 100;
        System.out.println("Simple Interest is: " + SI);
    }
}
