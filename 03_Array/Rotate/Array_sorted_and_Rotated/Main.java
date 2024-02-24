
public class Main {
    public static void main(String[] args) {
        // int arr[] = { 3,4,5,1,2 };
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        System.out.println();
        boolean ans = check(arr);
        

        System.out.println("sorted or rotated: " + ans);

        boolean ans1 = check1(arr);
        System.out.println("sorted or rotated: " + ans1);
    }

    public static boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
        }

        if (count > 1)
            return false;

        return true;
    }

    public static boolean check1(int[] nums) {
        int pivot = 0;
        boolean isSorted = true;
        int n= nums.length;

        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                isSorted = false;
                pivot = i;
            }
        }
        if(isSorted)
          return true;

        int[] sortedArray = new int[n];
        int rotation = n-pivot;        //number of integers rotated
        for(int i=0;i<n;i++){          //place a rotated number into correct position in a new array
            sortedArray[(i+rotation)%n] = nums[i];
        }  

         for(int i=1;i<n;i++){
            if(sortedArray[i]<sortedArray[i-1]){
                return false;
            }
        }
        return true;
    }
}
