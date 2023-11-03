############################ Brute Force ############################

```

import java.util.*;

class LongestSubArray {

static int longestSubArrayWthSumDivByK(int arr[], int N, int k)
{
	int maxl = 0;
	for (int i = 0; i < N; i++) {
	int sum1 = 0;
	for (int j = i; j < N; j++) {
		sum1 += arr[j];
		if (sum1 % k == 0)
		maxl = Math.max(maxl, j - i + 1);
	}
	}

	return maxl;
}
public static void main(String[] args)
{
	int arr[] = { 2,4,8,1,7,3,6,1,9,2,7,3 };
	int n = arr.length;
	int k = 7;

	System.out.println("Length = "
					+ longestSubArrayWthSumDivByK(arr, n, k));
}
}


```

Output: 7

Time Complexity: O(N2)
We are using two nested loops

Space Complexity: O(1) 


################################ Optimal Solution #####################################

```
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

```

Output: 6

Time Complexity: O(N)
We are using two nested loops

Space Complexity: O(N) 

