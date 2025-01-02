public class fibonachhi {

    public static int fibonachhi(int n){
        
        if(n == 1 || n == 0){
            return n;
        }

        int fib = fibonachhi(n-1);
        int fib2 = fibonachhi(n-2);
        return fib + fib2;
    }

    public static void main(String[] args) {
        System.out.println(fibonachhi(10));
    }
}
