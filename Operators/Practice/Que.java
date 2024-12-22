package Practice;
public class Que {
    public static void main(String[] args) {
        int x = 2, y = 5;

        int exp1 = (x*y/x);
        int exp2 = (x*(y/x));

        System.out.println("Result of (x*y/x): " + exp1);
        System.out.println("Result of (x*(y/x)): " + exp2);
    }
}
