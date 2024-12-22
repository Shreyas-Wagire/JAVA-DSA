public class Que3 {

    public static boolean palindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n != 0) {
            int remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }

        return original == reverse; // Return true if the number is a palindrome
    }

    public static void main(String[] args) {
        int num = 505;
        boolean isPalindrome = palindrome(num);

        if (isPalindrome) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
