public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(12345,0));
    }

    private static int reverseNumber(int n,int rev) {
        if(n==0){
            return rev;
        }
        return reverseNumber(n/10,rev*10+(n%10));
    }
}
