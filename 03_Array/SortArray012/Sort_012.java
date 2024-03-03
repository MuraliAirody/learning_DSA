import java.util.ArrayList;
import java.util.Arrays;

public class Sort_012 {
    public static void main(String args[]) {
        int n = 6;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
        sortArray(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

    }

    public static void sortArray(ArrayList<Integer> arr,int n){
       int zeroCount=0;
       int oneCount=0;
       int twoCount=0;

       for(int i=0;i<n;i++){
        if(arr.get(i)==0)
          zeroCount++;
        else if(arr.get(i)==1)
          oneCount++;
        else
          twoCount++;    
       }

       for(int i=0;i<zeroCount;i++){
        arr.set(i, 0);
       }
       for(int i=zeroCount;i<zeroCount+oneCount;i++){
        arr.set(i, 1);
       }
       for(int i=zeroCount+oneCount;i<zeroCount+oneCount+twoCount;i++){
        arr.set(i, 2);
       }
    }
     
 
}