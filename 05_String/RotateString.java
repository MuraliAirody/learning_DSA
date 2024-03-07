public class RotateString {
    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";

        boolean ans = rotateString(s, goal);

        System.out.println(ans);

    }

    public static boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            char last = sb.charAt(s.length() - 1);
            for (int j = s.length() - 1; j > 0; j--) {
                sb.setCharAt(j, sb.charAt(j - 1));
            }
            sb.setCharAt(0, last);

            if (sb.toString().equals(goal)) {

                return true;
            }
        }

        return false;
    }
}
