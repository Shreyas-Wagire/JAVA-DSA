public class HollowRectangle {
    public static void hollowRectangle(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                // Print '*' at the border of the rectangle
                if (i == 1 || i == row || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    // Print space inside the rectangle
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRectangle(5, 8);
    }
}
