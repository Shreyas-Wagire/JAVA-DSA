
public class spiralmatrix {

    public static void spiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;

            // Right column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            // Bottom row
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--;
            }

            // Left column
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }
        System.out.println();
    }

    public static int diagonal(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // spiral(matrix);
        System.out.println(diagonal(matrix));

    }
}


