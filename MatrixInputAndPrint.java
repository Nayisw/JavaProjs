import java.util.Scanner;

public class MatrixInputAndPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.print("Enter elements for a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {                
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered 3x3 matrix:");

        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
