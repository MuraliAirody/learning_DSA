
public class MaxSubArray {
    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);

    }

    public static int maxSubarraySum(int[] arr, int n) {
        int max  = Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        int sum = 0;
        for(int j=i;j<n;j++){
           sum+= arr[j];
           if(max<sum){
            max= sum;
        }
        }
        
       }
       return max;
    }
}
