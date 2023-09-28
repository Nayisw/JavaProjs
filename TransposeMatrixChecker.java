import java.util.Scanner;

public class TransposeMatrixChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean isTranspose = true;
        if (rows != columns) {
            isTranspose = false;
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (matrix[i][j] != matrix[j][i]) {
                        isTranspose = false;
                        break;
                    }
                }
                if (!isTranspose) {
                    break;
                }
            }
        }

        if (isTranspose) {
            System.out.println("The matrix is its own transpose.");
        } else {
            System.out.println("The matrix is not its own transpose.");
        }

        scanner.close();
    }
}
