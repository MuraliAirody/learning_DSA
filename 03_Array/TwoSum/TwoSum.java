import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String args[]) {
        int n = 5;
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;
        int[] ans = twoSum(arr, target);
        System.out.println("This is the answer for variant 1: " + Arrays.toString(ans));
    }

    // public static int[] twoSum(int[] nums, int target) { // Time Complexity ->
    // O(n) //Space Complexity -> O(n)

    // HashMap<Integer,Integer> map = new HashMap<>();

    // for(int i=0;i<nums.length;i++){
    // if(map.containsKey(target-nums[i])){
    // return new int[]{map.get(target-nums[i]),i};
    // }else{
    // map.put(nums[i],i);
    // }
    // }
    // return new int[]{-1,-1};
    // }

    public static int[] twoSum(int[] nums, int target) { // Time Complexity -> O(n)+O(n*log n) //Space Complexity ->
                                                         // O(1)

        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while (left<right) {

            if(nums[left] + nums[right] == target){
                return new int[]{left,right};
            }else if(nums[left]+nums[right]<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
