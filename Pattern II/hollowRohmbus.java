public class hollowRohmbus {
    public static void rohmbus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) {
                // Print '*' at the border of the rectangle
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    // Print space inside the rectangle
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rohmbus(5);
    }
}
