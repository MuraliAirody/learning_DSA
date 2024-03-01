public class LargestOddNumber {
    public static void main(String[] args) {
        Solution sl = new Solution();
        String ans  =  sl.largestOddNumber("7542351161");

        System.out.println("ans: "+ans);
        
    }
}

class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if(Integer.valueOf(String.valueOf(num.charAt(i)))%2!=0){
                return num.substring(0, i+1);
            }
        } 
        return "";  
    }
}