
public class RemoveDuplicate {
    public static void main(String[] args) {
        // int arr[] = { 3,4,5,1,2 };
        int arr[] = { 1, 2,2,3,4,4 };
        int n = arr.length;

        System.out.println();
        int size = removeDuplicates(arr);
        System.out.print("unique array: ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }

        // boolean ans1 = check1(arr);
        // System.out.println("sorted or rotated: " + ans1);
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}
