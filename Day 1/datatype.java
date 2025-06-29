import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Data Types
        // byte, int, short, long, double, float, char and boolean
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Int: ");
        int a = sc.nextInt();
        System.out.println("Enter the Byte: ");
        byte b = sc.nextByte();
        System.out.println("Enter the Short: ");
        short c = sc.nextShort();
        System.out.println("Enter the Long: ");
        long d = sc.nextLong();
        System.out.println("Enter the Float: ");
        float e = sc.nextFloat();
        System.out.println("Enter the Double: ");
        double f = sc.nextDouble();
        System.out.println("Enter the Boolean: ");
        boolean g = sc.nextBoolean();
        System.out.println("Enter the String: ");
        String h = sc.next();

        // Print all the Values
        System.out.println("Int is " +a+ ", Byte is " +b+ ", Short is " +c+ ", Long is " +d);
        System.out.println("Float is " +e+ ", Double is " +f);
        System.out.println("Boolean is \"" +g+ "\", String is \"" +h+ "\"");
    }
}