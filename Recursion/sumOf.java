public class sumOf {

    public static int sumOF(int n){
        if(n==1){
            return n;
        }
        return n + sumOF(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sumOF(5));
    }
}
