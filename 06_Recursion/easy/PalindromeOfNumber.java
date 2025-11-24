public class PalindromeOfNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(123)); // false
    }

    static int reverse(int num, int rev) {
        if (num == 0) return rev;
        return reverse(num / 10, rev * 10 + num % 10);
    }

    static boolean isPalindrome(int num) {
        return num == reverse(num, 0);
    }

}
