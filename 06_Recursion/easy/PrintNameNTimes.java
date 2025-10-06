public class PrintNameNTimes {
    public static void main(String[] args) {
        printName("Name",5);
    }

    public static void printName(String name,int times){

       if(times==0)
         return;

       System.out.println(name);  
       printName(name, --times); //pre-decrement
    }
}
