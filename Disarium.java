import java.util.Scanner;

public class Disarium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        sc.close();
        String p = Integer.toString(n);
        int power= p.length();
        int sum = 0; int original= n;
        while(n!=0){
            int temp = n%10;
            sum += Math.pow(temp, power);
            power--;
            n /=10;
        }
        if (sum == original) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not a Disarium Number");
        }
    }
}
