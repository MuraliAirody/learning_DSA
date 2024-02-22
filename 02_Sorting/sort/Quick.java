import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quick {
    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {4, 6, 214, -5, -87, 9, 81, 37});
        int n = arr.size();
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr = Solution.quickSort(arr);
        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

} 
class Solution {
    public static List<Integer> quickSort(List<Integer> arr){
        qs(arr,0,arr.size()-1);
        return arr;
    }

    public static void qs(List<Integer>arr,int low,int high){
        if(low<high){
            int pivot = pivot(arr,low,high);
            qs(arr,low,pivot-1);
            qs(arr,pivot+1,high);
        }
    }

    public static int pivot(List<Integer>arr,int low,int high){
       int pivot  = low;
       int i = low;
       int j = high;

       while(i<j){
        while(arr.get(i)<=arr.get(pivot) && i<high){
            i++;
        }
        while(arr.get(j)>arr.get(pivot) && j>low){
            j--;
        }
        if(i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
        }
       }
       int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }
}
