import java.util.*;
public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, choice, evenSum = 0, oddSum = 0;

        do { 
            System.out.print("Enter a number: ");
            num = sc.nextInt();

            if(num % 2 ==0){
                evenSum += num;
            }
            else{
                oddSum += num;
            }

            System.out.println("You Want to cotinues if yes press 1 or press 0");

            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("The Even is "+ evenSum);
        System.out.println("The Odd "+ oddSum);
    }
}
