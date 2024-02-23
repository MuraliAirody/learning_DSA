/* 
public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
    }

    public static void main(String args[]) {

        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int k = 4;
        System.out.println("Before rotate:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        rotate(arr, k);
        System.out.println("After rotate:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/
// Time Complexity: O(n)
// Space Complexity: O(n)

public class RotateArray {

    public static void reverse(int[] nums, int i, int j) {

        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }

    }

    public static void rotate(int[] arr, int k) {

        if (k > arr.length)
            k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

    }

    public static void main(String args[]) {

        int arr[] = { 13, 46, 24, 52, 20, 9 };
        int k = 4;
        System.out.println("Before rotate:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        rotate(arr, k);

        System.out.println("After rotate:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)