import java.util.ArrayList;
import java.util.Scanner;

public class Merge {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Solution.mergeSort(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
class Solution {

    public static void merge(int[] arr,int low,int mid, int high){
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while (left<=mid && right<=high) {
            if(arr[left]<arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }

        while (left<=mid) {
            list.add(arr[left]);
            left++;
        }
        while (right<=high) {
            list.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
           arr[i] = list.get(i-low);
        }
    }
    
    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high) return;

        int mid  = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
}
