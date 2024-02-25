
public class ReverseNumber {
    public static void main(String[] args) {
        
        int num = 1534236469;
        int reverse = 0;
        while (num>0) {
            int rem = num % 10;
            reverse =  reverse*10 + rem;
            num = num /10;
        } 
        System.out.println(reverse);
    }

    public int reverse(int x) {        
        long reverse = 0;
        int num = x;
        while (Math.abs(num)>0) {
            int rem = num % 10;
            reverse =  reverse*10 + rem;
            num = num /10;
        }
        
        return (reverse<Integer.MAX_VALUE && reverse>Integer.MIN_VALUE) ? (int)reverse:0;
    }
}
