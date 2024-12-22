
import java.util.*;

public class calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Can not divide by 0.");
                } else {
                    int result = a / b;
                    System.out.println(result);
                }
                break;
            case '%':
                System.out.println(a % b);
                break;
            default: System.out.println("invalid operator!!");
        }
    }
}
