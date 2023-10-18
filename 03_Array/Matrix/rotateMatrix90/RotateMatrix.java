
class RotateMatrix {
      public static int[][] rotate(int [][]mat){
         int n = mat.length;
        
          for(int i=0;i<n;i++){
              for(int j=0;j<=i;j++){
                  int temp = 0;
                  temp = mat[j][i];
                  mat[j][i] = mat[i][j];
                  mat[i][j] = temp;
              }
          }

          for(int i=0;i<n;i++){
              for(int j=0;j<n/2;j++){
                  int temp = 0;
                  temp = mat[i][n-j-1];
                  mat[i][n-j-1] = mat[i][j];
                  mat[i][j] = temp;
              }
          }
        return mat;
  }
  public static void main(String args[]) {
      int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      int rotated[][] = rotate(arr);
      System.out.println("Rotated Image");
      for (int i = 0; i < rotated.length; i++) {
          for (int j = 0; j < rotated.length; j++) {
              System.out.print(rotated[i][j] + " ");
          }
          System.out.println();
      }

  }
}