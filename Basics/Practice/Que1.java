import java.util.*;

public class Que1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int c = sc2.nextInt();

        int n = a + b + c;
        float avg = (a+b+c)/n;
        System.out.println(avg);
        
    }
}
