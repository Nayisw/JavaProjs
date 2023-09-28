import java.util.Scanner;

public class CornerMatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.print("Enter elements for the [3x3] matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = matrix[0][0] + matrix[0][2] + matrix[2][0] + matrix[2][2];

        System.out.println("Sum of corner elements: " + sum);

        sc.close();
    }
}
