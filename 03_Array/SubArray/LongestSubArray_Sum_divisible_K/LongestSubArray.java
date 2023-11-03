import java.io.*;
import java.util.*;

class LongestSubArray{
 public static int longSubArrayWthSumDivByK(int arr[], int n, int k)
  {
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      int maxLength = 0;
      int sum = 0;
      int rem = 0;
      map.put(0,-1);
      
      for(int i=0;i<n;i++){
         sum+=arr[i];
         rem = sum % k;
         if(rem<0){
             rem+=k;
         }
         
         if(map.containsKey(rem)){
             int length = i - map.get(rem);
             maxLength = Math.max(maxLength,length);
             }
          else{
              map.put(rem,i);
          }   
      }
      
      return maxLength;
  }
  
  public static void main (String[] args) throws IOException{
		    int[] arr = {-3,-9,-4,8,5,4,2,6};
	        int ans = longSubArrayWthSumDivByK(arr, 8, 7); 
	        
	        System.out.println("max length= "+ans);
		}

}



