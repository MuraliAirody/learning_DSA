//recursion
public class BinarySearch {
    public static void main(String[] args) {
        int target = 20;
        int[] arr = { 1, 2, 3, 5, 20, 50, 99, 101 };
        int ans = binarySearch(0, arr.length - 1, arr, target);
        System.out.println(ans);
    }

    public static int binarySearch(int start, int end,int[] arr,int target){
      
        int mid = start+(end-start)/2;

        if(start>end)
            return -1;

        if(arr[mid]==target){
            return mid;
        }else if(target<arr[mid]){
          return binarySearch(start, mid-1, arr, target);
        }else {
          return binarySearch(mid+1, end, arr, target);
        }
    }
}
