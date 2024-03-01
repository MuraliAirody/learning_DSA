import java.util.Arrays;

public class LongestCommonPrifix {
    public static void main(String[] args) {
        Solution sl = new Solution();
        String[] strs = {"flower","flow","flight"};
        String ans = sl.longestCommonPrefix(strs);

        System.out.println(ans);
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int index = 0;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(i))
              index++;
            else
              break;

        }
        return index == 0 ? "":str1.substring(0,index);
    }
}