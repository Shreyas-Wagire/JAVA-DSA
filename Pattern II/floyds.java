public class floyds {
    public static void floyds(int n, int count) {
        count = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    } 

    public static void main(String[] args) {
        floyds(5, 0);
    }
}
