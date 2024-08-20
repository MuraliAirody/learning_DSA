import java.util.Arrays;

public class MinLengthString {
    public static void main(String[] args) {
        int ans = SolutionMinLengthString.minLength("PPPPPP@PPP@PP$PP");

        System.out.println(ans);
    }
}

class SolutionMinLengthString{
    public static int minLength(String s){
      int minLength = Integer.MAX_VALUE;

      String[] grp = s.split("\\$");

      System.out.println(Arrays.toString(grp));

      for(int i=0;i<grp.length;i++){
        String[] newGrp = grp[i].split("@");

        for(int j=0;j<newGrp.length;j++)
          minLength = Math.min(minLength, newGrp[j].length());
      }

      return minLength;

    }

}