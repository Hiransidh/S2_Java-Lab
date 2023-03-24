import java.util.Scanner;
public class matrix2 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter no of rows of matrix: ");
        int rows = input.nextInt();
        System.out.print("Enter no of columns of matrix: ");
        int columns = input.nextInt();
        int[][] matrix = new int[rows][columns];
        int[][] transposeMatrix = new int[columns][rows];
        System.out.println("Enter values of matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose: ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
