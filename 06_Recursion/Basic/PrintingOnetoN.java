public class PrintingOnetoN {

    // public static void main(String[] args) {
    //     printingOnetoN(1,10);
    // }
    
    // public static void printingOnetoN(int start,int n){
    //     if(start>n)
    //      return;

    //      System.out.println(start);
    //      printingOnetoN(++start, n);
    // }

    public static void main(String[] args) {
        printingOnetoN(10);
    }
    
    public static void printingOnetoN(int n){
        if(n==0)
         return;

         printingOnetoN(--n);
         System.out.println(n);
    }
}
