import java.util.Scanner;

public class Esercizio {

    public static void riempiPerRighe(int[][] matrix, int rows, int cols) {
        int rowIndex = 0;
        int colIndex = 0;
        int value = 1;

        while (rowIndex < rows) {
            colIndex = 0;
            while (colIndex < cols) {
                matrix[rowIndex][colIndex] = value;
                ++value;
                ++colIndex;
            }
            ++rowIndex;
        }
    }

    public static void riempiPerColonne(int[][] matrix, int rows, int cols) {
        int rowIndex = 0;
        int colIndex = 0;
        int value = 1;

        while (colIndex < cols) {
            rowIndex = 0;
            while (rowIndex < rows) {
                matrix[rowIndex][colIndex] = value;
                ++value;
                ++rowIndex;
            }
            ++colIndex;
        }
    }

    public static void main(String[] args) {
        int rows, cols;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserire il numero di righe della matrice: ");
        do {
            rows = Integer.parseInt(scanner.nextLine());
        } while (rows < 0);

        System.out.println("Inserire il numero di colonne della matrice: ");
        do {
            cols = Integer.parseInt(scanner.nextLine());
        } while (cols < 0);

        int[][] matrix = new int[rows][cols];

        riempiPerRighe(matrix, rows, cols);
        UtilsMatrice.visualizza(matrix);

        System.out.println();

        riempiPerColonne(matrix, rows, cols);
        UtilsMatrice.visualizza(matrix);
    }
}