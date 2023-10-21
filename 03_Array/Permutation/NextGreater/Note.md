
#################################### Brute Force ############################################
```
import java.util.*;

class NextGreaterPermutation{
    
    //recursive way of finding all the permutation
    private static void recurPermute(int index, int[] nums, List <int[]> ans) {
        if (index == nums.length) {
        	
            int[] ds = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                ds[i]=nums[i];
            }
            ans.add(ds);
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }
    
    //swap method helps in recursion
    private static void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    
    //permute method helps in removing duplicates and sorting the list of permutation
    public static List <int[]> permute(int[] nums) {
    	System.out.println("Original Permutation: " + Arrays.toString(nums));
        
        Set<String> uniquePermutations = new HashSet<>();

        List<int[]> permutations = new ArrayList<>();
        recurPermute(0, nums, permutations);

        for (int[] perm : permutations) {
            uniquePermutations.add(Arrays.toString(perm));
        }

        permutations.clear();
        for (String s : uniquePermutations) {
            int[] perm = Arrays.stream(s.replaceAll("[\\[\\]\\s]", "").split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            permutations.add(perm);
        }
        
        permutations.sort((a, b) -> {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return a[i] - b[i];
                }
            }
            return 0;
        });
        
        return permutations;
    }
    
    //search helps in finding the target and returning the next greater permutation of the target
    public static int[] search(int[] nums){
    	
    	List<int[]> permutations = permute(nums);
    	
    	for(int i=0;i<permutations.size();i++) {
    		for(int j=0;j<permutations.get(0).length;j++) {
    			System.out.print(permutations.get(i)[j]+" ");
    		}
    		System.out.println();
    	}
    	    	
    	for (int i = 0; i < permutations.size(); i++) {
            if (Arrays.equals(permutations.get(i), nums)) {
                if (i == permutations.size() - 1) {
                    System.out.println("No greater permutation exists.");
                    return permutations.get(0);
                } else {
                    System.out.println("Next Greater Permutation: " + Arrays.toString(permutations.get(i + 1)));
                    return permutations.get(i+1);
                }
            }
        }
    	
    	return null;
    }
    
    
};

class Main {
    public static void main(String[] args) {
        int nums[] = {11,7,13,8,16,13};
        
        int[] ls = Solution.search(nums);
          
        System.out.println("All Permutations are");
        for (int i = 0; i < ls.length; i++) {
                System.out.print(ls[i] + " ");
            }
            System.out.println();
     }
}


```
//this logic not works for large test cases bcs of the lots of loops and recursion
//recursion only take O(N!×N)..

################################# Optimal Solution ####################################

![NextGreaterPermutation1-2023-10-18-1225](https://github.com/murali-1999/learning_DSA/assets/71452201/0cece3ab-5284-4061-b9a2-9178055914df)


```

import java.util.*;

public class NextGreaterPermutation {
    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        int n = A.size(); 
        
        // finding the break point(in which point sudden value decrement occurs)
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        //suppose there is  no break point(means entire given array in Descending order, so return ascending order of the given array)
        if (ind == -1) {
            // reverse the whole array:
            Collections.reverse(A);
            return A;
        }

        // finding the greater value which appears after the break point, and swap it with the break point value 
        for (int i = n - 1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                int tmp = A.get(i);
                A.set(i, A.get(ind));
                A.set(ind, tmp);
                break;
            }
        }
        
        //once swap, we need to arrange all the element in ascending order which are present after the break point

        int start = index+1;
        int end = n-1;
        while(start<end){
            if(A.get(start)>A.get(end)){
                int temp = A.get(start);
                A.set(start,A.get(end));
                A.set(end,temp);
            }
            start++;
            end--;
        }

        return A;
    }

    public static void main(String args[]) {
        List<Integer> A = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }

}

```
Time Complexity: O(3N)
where finding breakpoint take O(N), finding greater element after breakpoint O(N), Re Arranging elements after breakpoint will take O(N)

Space Complexity: Since no extra storage is required. Thus, its space complexity is O(1).

