public class ReverseASCII_Password {
    public static void main(String[] args) {
        String ans = Solution.ascii("796115110113721110141108");

        System.out.println(ans);
        // System.out.println(ans.length());
    }
}


class Solution{
    public static String ascii(String s){
      StringBuilder rev = new StringBuilder(s).reverse();

      int i = 0;
      String ans ="";
      int x = 0;
      while(i<rev.length()-1){
         x = Integer.valueOf(rev.charAt(i)+""+rev.charAt(i+1));
        //  System.out.println("x :"+x);
         if(x==32)
          ans+=" ";

         else if(x>=65 && x<=90 || x>=97 && x<=122)
           ans+= (char)x;
         
         else{
            x = Integer.valueOf(rev.charAt(i)+""+rev.charAt(i+1)+""+rev.charAt(i+2));
            // System.out.println("x :"+x);

            ans+=(char)x;
            i++;
         } 
         i+=2; 
      }
      return ans;
    }
}