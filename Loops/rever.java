public class rever {
    public static void main(String args[]){
        int n = 10899;
        int last = 0, rev =0;

        while(n>0){
            last = n % 10;
            rev = rev * 10 + last;
            n = n/10;
        }
        System.out.println(rev);
    }
}
