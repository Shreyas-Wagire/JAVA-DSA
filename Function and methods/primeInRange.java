public class primeInRange {

    public static boolean primeOrNot(int n) {
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for(int i = 2; i < n; i++){
            if (primeOrNot(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeInRange(10);
    }
}
