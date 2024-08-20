public class LargestOddNumber {
    public static void main(String[] args) {
        SolutionLargestOddNumber sl = new SolutionLargestOddNumber();
        String ans  =  sl.largestOddNumber("754235116");

        System.out.println("ans: "+ans);
        
    }
}

class SolutionLargestOddNumber {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            if(Integer.parseInt(String.valueOf(num.charAt(i)))%2!=0){
                return num.substring(0, i+1);
            }
        } 
        return "";  
    }
}