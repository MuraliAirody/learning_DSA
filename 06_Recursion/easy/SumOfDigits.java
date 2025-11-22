public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(print(1234));
    }

    public static int print(int n){
//        if(n/10 == 0){
//            return n;
//        }
//        if(n%10 == n){
//            return n;
//        }
        if(n == 0){
            return n;
        }

        return (n%10)+print(n/10);
    }
}
