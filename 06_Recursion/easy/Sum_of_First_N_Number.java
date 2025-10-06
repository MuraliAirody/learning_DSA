public class Sum_of_First_N_Number {
    public static void main(String[] args) {
        int ans = sum_of_First_N_Number(5);
        System.out.println(ans);
    }

    public static int sum_of_First_N_Number(int n) {
        if (n == 0)
            return 0;

        return n + sum_of_First_N_Number(n - 1);
    }
}