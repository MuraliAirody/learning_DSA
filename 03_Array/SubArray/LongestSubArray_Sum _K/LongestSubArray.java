
import java.util.*;

public class LongestSubArray {
    public static int getLongestSubarray(int []a, long k) {
        int n = a.length; 

        int left = 0, right = 0;
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
           
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }

    public static int getLongestSubarray2(int []arr, long k) {
        long sum = 0;
        int maxLen = 0;

        HashMap<Long,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }

            long rem =  sum - k;
            
            if(map.containsKey(rem)){
                int length = i - map.get(rem);
                maxLen = Math.max(maxLen, length+1);
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }

        return maxLen;
    }


    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
        int len2 = getLongestSubarray2(a, k);
        System.out.println("The length of the longest subarray in second method: " + len2);
    }
}
