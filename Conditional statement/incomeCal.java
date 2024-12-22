import java.util.*;

public class incomeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        long income = sc.nextLong();
        double newincome;

        if (income < 500000) {
            System.out.println(income);
            System.out.println("0% tax.");
        } 
        else if (income >= 500000 && income < 1000000) {
            newincome = income * 0.80;
            System.out.println("Income before tax: " + income);
            System.out.println("Income after 20% tax: " + newincome);
            System.out.println("20% tax is payable.");
        } 
        else {
            newincome = income * 0.70;
            System.out.println("Income before tax: " + income);
            System.out.println("Income after 30% tax: " + newincome);
            System.out.println("30% tax is payable.");  
        }
        sc.close();
    }
}
