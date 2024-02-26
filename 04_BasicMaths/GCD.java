public class GCD {
    public static void main(String[] args) {
        int num1 = 4, num2 = 18;

        int gcd = 1;
        
        int edge = Math.min(num1,num2);
        for(int i=1;i<=edge;i++){
            if(num1%i==0 && num2%i==0){
                if(gcd<i)
                 gcd=i;
            }
        }
        System.out.println("GCD: "+gcd);
    }
}
