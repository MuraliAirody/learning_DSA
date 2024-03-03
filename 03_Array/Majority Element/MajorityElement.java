import java.util.HashMap;

public class MajorityElement {
    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }
    // public static int majorityElement(int []v) {
    //     for(int i=0;i<v.length;i++){
    //         int count = 0;

    //         for(int j=0;j<v.length;j++){
    //             if(v[i] == v[j])
    //              count++;
    //         }

    //         if(count>v.length/2)
    //          return v[i];
    //     }
    //     return -1;

    // } 
    public static int majorityElement(int []v) {
       
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<v.length;i++){
            int count = map.getOrDefault(v[i], 0);
            map.put(v[i],count+1);
        }

        for(int i=0;i<v.length;i++){
           if(map.get(v[i])>v.length/2)
             return v[i];
        }

        return -1;

    } 
}
