import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        selectionSort(new int[]{1,7,9,2,3,4});

        int[] arr = {1,7,9,2,3,4};
        recursionSelectionSort(arr,0,1,0);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = {1,7,9,2,3,4};
        recursionSelectionSortMaxEle(arr1,arr.length-1,1,0);
        System.out.println(Arrays.toString(arr1));
    }


    private static void selectionSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int min_index = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[min_index]>arr[j]){
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void recursionSelectionSort(int[] arr, int i, int j,int min) {
        if(i>=arr.length){
            return;
        }
        if(j<arr.length){
            if(arr[min]>arr[j]){
                min = j;
            }
            recursionSelectionSort(arr,i,j+1,min);
        }else {
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            recursionSelectionSort(arr, i + 1, i + 1, i + 1);
        }
    }

    private static void recursionSelectionSortMaxEle(int[] arr, int r, int c,int max) {
        if(r==0){
            return;
        }

        if(c<=r){
            if(arr[max]<arr[c]){
                max = c;
            }
            recursionSelectionSortMaxEle(arr,r,c+1,max);
        }else{
            int temp = arr[max];
            arr[max] = arr[r];
            arr[r] = temp;
            recursionSelectionSortMaxEle(arr,r-1,0,0);
        }
    }

}
