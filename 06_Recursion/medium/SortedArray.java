import java.util.Arrays;
import java.util.List;

public class SortedArray {
    public static void main(String[] args) {
       Integer[]  arr = {3,2,5,9,6,1,5};

       recBubbleSort(arr,arr.length);

        System.out.println(Arrays.asList(arr));
    }

    public static void recBubbleSort(Integer[] arr,int n){
        if(n==1)
            return;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        recBubbleSort(arr,n-1);
    }
}
