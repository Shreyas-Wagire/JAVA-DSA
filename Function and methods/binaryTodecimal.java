
public class binaryTodecimal {

    public static void binaryTodecimal(int binary) {
        int myNo = binary;
        int pow = 0;
        int dec = 0;

        while (binary > 0) {
            int lastDigit = binary % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binary = binary / 10;
        }

        System.out.println("decimal of " + myNo + " = " + dec);
    }

    public static void main(String[] args) {
        binaryTodecimal(101);
    }
}
