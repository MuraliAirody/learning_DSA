import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
       bubbleSort(new int[]{1,7,9,2,3,4});

        int[] arr = {1,7,9,2,3,4};
//        recursionBubbleSort(arr,0,0);
//        System.out.println(Arrays.toString(arr));

        recursionBubbleSort2(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }


    private static void bubbleSort(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<(arr.length-1-i);j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void recursionBubbleSort(int[] arr,int i,int j){

        if(i>=arr.length){
            return;
        }
        if(j<arr.length-1-i) {
            if ((arr[j] > arr[j + 1])) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
            recursionBubbleSort(arr, i, j + 1);
        }else{
           recursionBubbleSort(arr, i+1,0);
        }
    }


    private static void recursionBubbleSort2(int[] arr,int r,int c){

        if(r==0){
            return;
        }
        if(c<r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c + 1];
                arr[c + 1] = arr[c];
                arr[c] = temp;
            }
            recursionBubbleSort2(arr, r, c + 1);
        }else{
            recursionBubbleSort2(arr, r-1,0);
        }
    }
}
