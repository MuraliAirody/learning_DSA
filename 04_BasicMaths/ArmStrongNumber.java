import java.util.ArrayList;
import java.util.List;

class ArmStrongNumber {
    static boolean armstrongNumber(int n) {
        int originalno = n;
        int power = 0;
        int temp = n;
        while (temp != 0) {
            power++;
            temp = temp / 10;
        }
        int sumOfPower = 0;
        while (n != 0) {
            int digit = n % 10;
            sumOfPower += (int) Math.pow(digit, power);
            n /= 10;
        }
        return (sumOfPower == originalno);
    }

    static boolean armstrongNumber1(int n) {
        int originalno = n;
        int power = 0;
        int temp = n;

        power = (int) (Math.log10(n) + 1);

        List<Integer> powerOfDigits = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            powerOfDigits.add((int) Math.pow(i, power));
        }

        int sumOfPowers = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sumOfPowers += powerOfDigits.get(digit);
            temp = temp / 10;
        }
        return (sumOfPowers == originalno);
    }

    public static void main(String[] args) {
        int n1 = 153;
        if (armstrongNumber(n1)) {
            System.out.println("Yes, it is an Armstrong Number\n");
        } else {
            System.out.println("No, it is not an Armstrong Number\n");
        }

        if (armstrongNumber1(n1)) {
            System.out.println("Yes, it is an Armstrong Number\n");
        } else {
            System.out.println("No, it is not an Armstrong Number\n");
        }

    }
}
