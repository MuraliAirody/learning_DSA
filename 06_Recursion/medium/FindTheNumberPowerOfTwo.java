public class FindTheNumberPowerOfTwo {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isPowerOfTwo(19));
    }
}

class Solution {
    public boolean isPowerOfTwo(int n) {
        return isPower(n);
    }

    public boolean isPower(int n){

        if(n==1){
            return true;
        }

        if(n%2!=0){
            return false;
        }

        return n>0 && isPower(n/2);
    }
}