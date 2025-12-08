import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 9;
        int pos = linearSearch(arr,target,0);
        if(pos==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Element at: "+pos);
        }
        int[] arr1 = {1,2,1,3,4,5,6};
        int target1 = 1;
        int lpos = linearSearchLastIndex(arr1,target1,arr1.length-1);
        if(lpos==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Element at: "+lpos);
        }

        linearSearchAllIndex(new int[]{1, 2, 1, 3, 4, 5, 6},1,0);
        System.out.println(list);

        System.out.println(linearSearchAllIndexList(new int[]{1, 2, 1, 3, 4, 5, 6},1,0,new ArrayList<>()));

        System.out.println(linearSearchAllIndexList2(new int[]{1, 2, 1, 3, 4, 5, 6},1,0));

    }

    private static int linearSearch(int[] arr, int target,int i) {
        if(i>arr.length-1){
            return -1;
        }
        if(arr[i]==target) {
            return i;
        }
        return linearSearch(arr,target,i+1);
    }

    private static int linearSearchLastIndex(int[] arr,int target,int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==target) {
            return i;
        }
        return linearSearchLastIndex(arr,target,--i);
    }

    private static void linearSearchAllIndex(int[] arr,int target,int i){
        if(i>arr.length-1){
            return;
        }
        if(arr[i]==target){
            list.add(i);
        }

        linearSearchAllIndex(arr,target,++i);
    }

    private static ArrayList<Integer>
            linearSearchAllIndexList(int[] arr,int target,int i, ArrayList<Integer> list){
        if(i>arr.length-1){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }

        return  linearSearchAllIndexList(arr,target,++i,list);
    }

    //without creating list
    private static ArrayList<Integer>
    linearSearchAllIndexList2(int[] arr,int target,int i){
        ArrayList<Integer> list = new ArrayList<>();

        if(i>arr.length-1){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }

        ArrayList<Integer> subRes =  linearSearchAllIndexList2(arr,target,++i);
        list.addAll(subRes);
        return list;
    }


}
