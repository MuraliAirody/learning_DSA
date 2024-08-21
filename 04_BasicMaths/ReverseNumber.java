
public class ReverseNumber {
    public static void main(String[] args) {

        int num = 1534236469;
        int reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        System.out.println(reverse);

        String ans = new ReverseNumber().reverse(-127);
        System.out.println(ans);
    }

    public String reverse(int x) {
        long reverse = 0;
        int num = x;
        while (Math.abs(num) > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
//            System.out.println(reverse);
            num = num / 10;
        }
        String reverseString = String.valueOf(Math.abs(reverse));
        if (x % 10 == 0) {
            reverseString = '0' + reverseString;
        }
        if (x < 0) {
            reverseString = '-' + reverseString;
        }
        return reverseString;
    }
}
