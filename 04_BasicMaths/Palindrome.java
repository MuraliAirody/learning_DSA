
public class Palindrome {
    public static void main(String[] args) {
        int X = 121;
        int dummy = X;
        boolean Y = isPalindrome(X);
        if (Y) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }

    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        if (x > 0 && x < 10)
            return true;

        int temp = x;
        int reverse = 0;
        while (temp > 0) {
            int rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }
        return (reverse == x);
    }
}
