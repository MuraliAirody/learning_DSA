
public class RemoveParentheses {
    public static void main(String[] args) {
        Solution sl = new Solution();
        String ans = sl.removeOuterParentheses("(()())(())");

        System.out.println(ans);
    }
}

class Solution {
    public String removeOuterParentheses(String s) {
        String ans = "";
        int bal = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (bal > 0) {
                    ans += s.charAt(i);
                }
                bal++;
            } else {
                bal--;
                if (bal > 0) {
                    ans += s.charAt(i);
                }
            }

        }
        return ans;
    }
}