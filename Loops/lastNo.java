public class lastNo {
    public static void main(String args[]){
        int n = 10899;
        int last = 0;

        while(n>0){
            last = n % 10;
            System.out.print(last);
            n = n/10;
        }

    }
}
