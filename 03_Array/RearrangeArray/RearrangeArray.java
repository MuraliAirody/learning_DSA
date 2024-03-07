import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};

        int[] ans = rearrangeArray(nums);

        System.out.println(Arrays.toString(ans));
    }
    // public static int[] rearrangeArray(int[] nums) {
    //     ArrayList<Integer> pos = new ArrayList<>();
    //     ArrayList<Integer> neg = new ArrayList<>();

    //     for(int i=0;i<nums.length;i++){
    //         if(nums[i]<0)
    //           neg.add(nums[i]);
    //         else
    //           pos.add(nums[i]);  
    //     }

    //     for(int i=0;i<nums.length/2;i++){
    //        nums[i*2] = pos.get(i);
    //        nums[i*2+1] = neg.get(i);
    //     }

    //     return nums;
    // }
    public static int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int posIndex = 0,negIndex=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[negIndex] = nums[i];
                negIndex+=2;
            }else{
                ans[posIndex] = nums[i];
                posIndex+=2;
            }
        }
        return ans;
    }
}
