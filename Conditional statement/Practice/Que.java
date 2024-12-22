package Practice;
import java.util.*;
public class Que {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if(0<=num){
            System.out.println(num + " is positive.");
        }
        else{
            System.out.println(num + " is negative.");
        }
    }
}
