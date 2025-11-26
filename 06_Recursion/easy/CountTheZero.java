public class CountTheZero {
    public static void main(String[] args) {
        System.out.println(countTheZeroInNumber(340200004,0));
    }

    private static int countTheZeroInNumber(int i, int count) {
        if(i==0){
            return count;
        }
        if(i%10==0)
            count++;
        return  countTheZeroInNumber(i/10,count);
    }


}
