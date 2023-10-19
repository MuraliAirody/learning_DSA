####################################### Optimal Approach ##########################################

![SpiralMatrix3-2023-10-18-1225](https://github.com/murali-1999/learning_DSA/assets/71452201/6b4f4d10-9209-4b5d-b1b9-0bb69b6e70b1)

```
public class SpiralMatrix {
    public static int[] spiralMatrix(int [][]MATRIX) {
        int rowStart = 0, rowEnd = MATRIX.length-1;
        int colStart = 0, colEnd = MATRIX[0].length-1;
        int size = MATRIX.length*MATRIX[0].length;
        int[] ans = new int[size];
        int index = 0;

        while(rowStart<=rowEnd && colStart<=colEnd){

            //moving towards left to right in row

            for(int i=colStart;i<=colEnd;i++){
               ans[index] = MATRIX[rowStart][i];
               index++;
            }
            rowStart++;
            
            //moving from to to bottom in column

            for(int i=rowStart;i<=rowEnd;i++){
               ans[index] = MATRIX[i][colEnd];
               index++; 
            }
            colEnd--;

            //moving towards right to left in row

            if(rowStart<=rowEnd){  //suppose if we have single row 
                for(int i=colEnd;i>=colStart;i--){
                    ans[index] = MATRIX[rowEnd][i];
                    index++;
               }
               rowEnd --;
            }
            
            //moving from bottom to top in column

            if(colStart<=colEnd){  //suppose if we have single column
                for(int i=rowEnd;i>=rowStart;i--){
               ans[index] = MATRIX[i][colStart];
                index++;
              }
            colStart++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        
        //Matrix initialization.
        int[][] mat = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        
        int[] ans = spiralMatrix(mat);

        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }

        System.out.println();
    }
}
```


Time Complexity: O(n x m) all the elements are traversed only once here.

Space Complexity: O(n × m) Extra Space used for storing traversed elements.

