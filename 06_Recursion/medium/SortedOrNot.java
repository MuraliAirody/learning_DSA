public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,3,4,8};
        boolean res = sortedOrNot(arr,0);
        if(res){
            System.out.println("Sorted array");
        }else{
            System.out.println("Unsorted array");
        }
    }

    private static boolean sortedOrNot(int[] arr,int index) {
        if(index==arr.length-1){
            return true;
        }

        if(arr[index]>arr[index+1]){
            return false;
        }

        return sortedOrNot(arr,index+1);
    }
}
