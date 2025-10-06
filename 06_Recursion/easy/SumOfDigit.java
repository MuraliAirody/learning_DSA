public class SumOfDigit {
    public static void main(String[] args) {
        int res=sumOfDigit(555);
        System.out.println(res);
    }

    static int sumOfDigit(int num){
        if(num==0){
            return 0;
        }
        int rem = num%10;
        return rem+sumOfDigit(num/10);
    }
}
