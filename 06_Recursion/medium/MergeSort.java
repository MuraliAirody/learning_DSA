import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
       int[] arr = {3, 7, 6, -10, 15, 23, 55, -13};
       mergeSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSort(int[] arr,int start,int end) {
        if(start>=end){
            return;
        }

        int mid = start+(end-start)/2;

        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);

        merge(arr,start,end,mid);
    }

    private static void merge(int[] arr, int start,int end,int mid) {
       int left = start;
       int right = mid+1;

        List<Integer> res =  new ArrayList<>();

       while(left<=mid && right<=end){
           if(arr[left]<=arr[right]){
               res.add(arr[left]);
               left++;
           }else{
               res.add(arr[right]);
               right++;
           }
       }

       while(left<=mid){
           res.add(arr[left]);
           left++;
       }

       while(right<=end){
           res.add(arr[right]);
           right++;
       }

       for(int i=0;i<res.size();i++){
           arr[start+i] = res.get(i);
       }
    }
}
