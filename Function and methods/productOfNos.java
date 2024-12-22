import java.util.Scanner;

public class productOfNos {

    public static int product(int a, int b) {
        int product = a * b;

        return product;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First No: ");
        int a = sc.nextInt();
        System.out.print("Enter Second No: ");
        int b = sc.nextInt();

        System.out.println("The Result is: "+product(a, b));
        
    }
}