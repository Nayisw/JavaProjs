import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = sc.nextInt();
        sc.close();

        String binary = binaryConversion(n);
        System.out.println("Binary representation: " + binary);
    }
    public static String binaryConversion(int n) {
        String binary = Integer.toBinaryString(n);
        return binary;
    }
}
