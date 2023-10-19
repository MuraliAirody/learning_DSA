public class SpiralMatrix {
    public static int[] spiralMatrix(int [][]MATRIX) {
        int rowStart = 0, rowEnd = MATRIX.length-1;
        int colStart = 0, colEnd = MATRIX[0].length-1;
        int size = MATRIX.length*MATRIX[0].length;
        int[] ans = new int[size];
        int index = 0;

        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int i=colStart;i<=colEnd;i++){
               ans[index] = MATRIX[rowStart][i];
               index++;
            }
            rowStart++;

            for(int i=rowStart;i<=rowEnd;i++){
               ans[index] = MATRIX[i][colEnd];
               index++; 
            }
            colEnd--;

            if(rowStart<=rowEnd){
                for(int i=colEnd;i>=colStart;i--){
                    ans[index] = MATRIX[rowEnd][i];
                    index++;
               }
               rowEnd --;
            }
            
            if(colStart<=colEnd){
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

