import java.awt.image.BandCombineOp;
import java.util.Scanner;

public class BinomilaCoff {
    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
                 fact = fact * i;
        }
        return fact;
    }

    public static int BinomilaCoff(int n , int r) {
        int n_Fact = factorial(n);
        int r_Fact = factorial(r);
        int nr = factorial(n-r);

        int Result = n_Fact / (r_Fact * nr);

        return Result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println("Result is " + BinomilaCoff(n, r) );
    }
}
