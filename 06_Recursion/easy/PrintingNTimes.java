
public class PrintingNTimes {
    public static void main(String[] args) {
        print(3);
    }

    public static void print(int n) {
        int count = n;
        if (count == 10)
            return;

        System.out.println(count);

        count++;
        print(count);
    }
}
