import java.util.* ;

public class MatrixZero {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.

        boolean row0 = false;
        boolean col0 = false;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    if(i==0)
                      row0 = true;
                    if(j==0)
                      col0 = true;
                    
                    matrix.get(0).set(j,0);
                    matrix.get(i).set(0,0);    
                }
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix.get(0).get(j)==0 || matrix.get(i).get(0)==0){
                    matrix.get(i).set(j,0);
                }
            }
        }
        
        if(row0){
            for(int j=0;j<m;j++){
                matrix.get(0).set(j,0);
            }
        }
        if(col0){
            for(int i=0;i<n;i++){
                matrix.get(i).set(0,0);
            }
        }
        
        return matrix;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(0, 1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

        System.out.println("The Final matrix is: ");
        for (ArrayList<Integer> row : ans) {
            for (Integer ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}