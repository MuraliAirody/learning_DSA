public class Fibo {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            System.out.println(fibonacci(i));
        }
    }

    private static int fibonacci(int i) {
        if(i<2){
            return i;
        }

        return fibonacci(i-1)+fibonacci(i-2);
    }
}
