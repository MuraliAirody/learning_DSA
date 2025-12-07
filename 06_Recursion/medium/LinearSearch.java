public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 9;
        int pos = linearSearch(arr,target,0);
        if(pos==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Element at: "+pos);
        }
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

}
