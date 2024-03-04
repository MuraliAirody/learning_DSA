import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";
        System.out.println(checkAnagrams(Str1, Str2));
    }

    // public static boolean checkAnagrams(String str1, String str2) {
    //     if(str1.length()!=str2.length())
    //      return false;

    //     str1 = SortString(str1); 
    //     str2 = SortString(str2); 

    //     if(str1.equals(str2))
    //       return true;
    //     return false;  
    // }

    // public static String SortString(String str) {
    //     char[] ch = str.toCharArray();
    //     Arrays.sort(ch);
    //     return Arrays.toString(ch);
    // }
    public static boolean checkAnagrams(String str1, String str2) {
        str1=str1.toUpperCase();
        str2=str2.toUpperCase();

        if(str1.length()!=str2.length())
          return false;

        int[] feq = new int[26];

        for(int i=0;i<str1.length();i++){
            feq[str1.charAt(i)-'A']++;
        }  
        for(int i=0;i<str2.length();i++){
            feq[str2.charAt(i)-'A']--;
        }  
        for(int i=0;i<26;i++){
            if(feq[i]!=0)
              return false;
        }  

        return true;
    }

}
