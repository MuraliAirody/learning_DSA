package pattern;

public class DownwardTriangle {
    public static void main(String[] args) {

        int num = 5;
        downwardTriangle(0,num);

        normalTriangle(0,3);
    }

    private static void downwardTriangle(int col,int row){
        if(row==0){
            return;
        }

        if(col<row){
            System.out.print("* ");
            downwardTriangle(col+1,row);
        }else{
            System.out.println();
            downwardTriangle(0,row-1);
        }
    }

    private static void normalTriangle(int col,int row){
        if(row==0){
            return;
        }

        if(col<row){
            normalTriangle(col+1,row);
            System.out.print("* ");
        }else{
            normalTriangle(0,row-1);
            System.out.println();
        }
    }
}
