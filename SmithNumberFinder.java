import java.util.Scanner;

public class SmithNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isSmithNumber(n)) {
            System.out.println(n + " is a Smith number.");
        } else {
            System.out.println(n + " is not a Smith number.");
        }
        sc.close();
    }

    static int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    static int primeFactorSum(int number) {
        int sum = 0;
        int divisor = 2; 
        while (number > 1) {
            if (number % divisor == 0) {
                sum += digitSum(divisor);
                number /= divisor;
            } else {
                divisor++;
            }
        }
        return sum;
    }

    static boolean isSmithNumber(int number) {
        return digitSum(number) == primeFactorSum(number);
    }
}
