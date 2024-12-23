public class Odd_even {

    public static void isEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Number is Even.");
        }
        else{
            System.out.println("Number is Odd.");
        }
    }

    public static void main(String[] args) {
        isEven(5);
        isEven(4);
    }
}
