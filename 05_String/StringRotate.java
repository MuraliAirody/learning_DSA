public class StringRotate {
    public static void main(String[] args) {
        // Boolean ans = new Solution().isRotated("amazon", "azonam");
        Boolean ans = SolutionStringRotate.isRotated("daxjheq", "eqdaxjh");

        System.out.println(ans);
    }
}
class SolutionStringRotate
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
          char[] s1=str1.toCharArray();
        
           rotate(s1,0,s1.length-1);
           System.out.println(s1);

           rotate(s1, 0, 1);
           rotate(s1, 2, s1.length-1);

           System.out.println(s1);

           if(new String(s1).equals(str2))
             {  
                return true;
            }

           char[] s2 = str1.toCharArray();
        
           rotate(s2,0,s2.length-1);
           rotate(s2, 0, s2.length-1-2);
           rotate(s2, s2.length-2, s2.length-1);

           System.out.println(s2);

           if(new String(s2).equals(str2))
             {
                return true;
            }

           return false;   
        
    }
    
    public static void rotate(char[] arr,int start, int end){
        
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    
}