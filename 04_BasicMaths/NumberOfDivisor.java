import java.util.ArrayList;
import java.util.List;

public class NumberOfDivisor {
    public static void main(String[] args) {
        int num = 12;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                System.out.println(i);
            if (i == num / 2)
                System.out.println(num);
        }
        System.out.println("-----------------------------------");
        /*
         * num = 36
         *
         * 1*36
         * 2*18
         * 3*12
         * 4*9  // above 6 divisors are increasing
         * 6*6 // above and below half are mirror images
         * 9*4  // divisors are decreasing below 6
         * 12*3
         * 18*2
         * 36*1
         * */

        List<Integer> div = new ArrayList<Integer>();

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                div.add(i);
            if (i != num / i)
                div.add(num / i);
        }
        div.stream().forEach(d -> System.out.println(d));
    }
}
