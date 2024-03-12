import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        // String[] arr = {"geeksforgeeks", "geeks", "geek","geezer"};
        // String[] arr = {"cluster", "clue", "club","clutch","clumsy"};
        String[] arr = {"hello", "world"};

        String ans =  new Solution().longestCommonPrefix(arr, arr.length);

        System.out.println(ans);
    }
}

// class Solution{
//     String longestCommonPrefix(String arr[], int n){
                
//                String c = arr[0];

//        for(int i=1;i<arr.length;i++){
//            if(arr[i].length()<c.length())
//              c = arr[i];
//        }    
       
//        for(int i=0;i<arr.length;i++){
//            String ans = "";

//            for(int j=0;j<c.length();j++){
//              System.out.println("aar[i] "+arr[i]+" "+"c "+c);
//              System.out.println("j "+arr[i].charAt(j)+" "+c.charAt(j));

//                if(arr[i].charAt(j)==c.charAt(j)){
//                    ans+=arr[i].charAt(j);
//                }else{
//                 break;
//                }
//            }
//         c = ans;

//        }
       
//        return c==""?"-1":c;
//     }
// }

// class Solution{
//     String longestCommonPrefix(String arr[], int n){
        
//         if(arr.length==0)
//           return "-1";
          
//         if(arr.length==1)
//           return arr[0];
        
//         Arrays.sort(arr);
        
//         int end = Math.min(arr[0].length(),arr[arr.length-1].length());
//         int i=0;
        
//         while(i<end && arr[0].charAt(i)==arr[arr.length-1].charAt(i))
//           i++;
          
//         return arr[0].substring(0,i)==""?"-1":arr[0].substring(0,i);  
         
//     }
// }
class Solution{
    String longestCommonPrefix(String arr[], int n){

        StringBuilder s = new StringBuilder();
        
        if(arr.length==0)
          return "-1";
          
        if(arr.length==1)
          return arr[0];
        
        Arrays.sort(arr);
        
        char[] first = arr[0].toCharArray();
        char[] last = arr[arr.length-1].toCharArray();


        for(int i=0;i<first.length;i++){
            if(first[i] != last[i])
              break;
           s.append(first[i]);
        }
        return s.toString().equals("")?"-1":s.toString();
    }
}