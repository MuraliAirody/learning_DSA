public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
        int target = 3;
        int result = rotatedBinarySearch(0,arr.length-1,arr,target);

        System.out.println(result);
    }

    private static int rotatedBinarySearch(int start,int end,int[] arr,int target){

        if(start>end){
            return -1;
        }

        int mid = start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return rotatedBinarySearch(start, mid - 1, arr, target);
            } else {
                return rotatedBinarySearch(mid + 1, end, arr, target);
            }
        }
        // Right half sorted
        else {
            if (target > arr[mid] && target <= arr[end]) {
                return rotatedBinarySearch(mid + 1, end, arr, target);
            } else {
                return rotatedBinarySearch(end, mid - 1, arr, target);
            }
        }

    }
}
