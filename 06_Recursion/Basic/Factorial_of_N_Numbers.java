public class Factorial_of_N_Numbers {
    public static void main(String[] args) {
        long ans = factorial_of_N_Numbers(3);
        System.out.println(ans);
    }

    public static long factorial_of_N_Numbers(int num){
       if(num==1){
        return 1;
       }

       return num * factorial_of_N_Numbers(num-1);
    }
}
