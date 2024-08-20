class LongestPalindrome{
    public static void main(String[] args) {
        String ans = SolutionLongestPalindrome.longestPalindrome("aaaabbaabb");
        System.out.println(ans);
    }
}

class SolutionLongestPalindrome {
    public static String longestPalindrome(String S) {
         String ans = "";
        
        if(S.length()<=1){
            return S;
        }
        
        for(int i=1;i<S.length();i++){
            int low=i;
            int high=i;
            
            while(S.charAt(low) == S.charAt(high)){
                low--;
                high ++;
                
                if(low==-1 || high==S.length())
                  break;
            }
            
            String pal = S.substring(low+1,high);
            if(pal.length()>ans.length())
              ans = pal;
              
            low=i-1;
            high=i;
            
            while(S.charAt(low) == S.charAt(high)){
                low--;
                high ++;
                
                if(low==-1 || high==S.length())
                  break;
            }
            
            pal = S.substring(low+1,high);
            if(pal.length()>ans.length())
              ans = pal;
              
        }
        
        return ans.length()==1?""+S.charAt(0):ans;
    }
} 
