public class decimalTobinary {
    
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

        System.out.println("Binary of " + myNo + " = " + dec);
    }

    public static void decimalTobinary(int n) {
        int mynum = n;
        int pow = 0;
        int dec = 0;

        while(n > 0){
            int rem = n % 2;
            dec = dec + (rem * (int)Math.pow(10,pow));

            pow++;
            n = n /2;
        }

        System.out.println("Deciaml " + mynum +" to binary "+dec);
    }

    public static void main(String[] args) {
        binaryTodecimal(101);
        decimalTobinary(5);
    }
}
