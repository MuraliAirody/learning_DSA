import java.util.Stack;

public class ReverseWordInString {
    public static void main(String[] args) {
        Solution sl = new Solution();
        String s = sl.reverseWords("a good   example");
        // String s = sl.reverseWords(" hello world ");

        System.out.println(s);
    }
}

// class Solution {
// public String reverseWords(String s) {
// String[] sArr = s.trim().split("\\s+");
// String rev = "";

// for(int i=0;i<sArr.length;i++){

// rev+=sArr[sArr.length-i-1]+" ";

// }

// return rev.trim();
// }
// }

// class Solution {
// public String reverseWords(String s) {
// Stack<String> stack = new Stack<>();
// s+=" ";
// String newString = "";
// for (int i = 0; i < s.length(); i++) {
// if (s.charAt(i) == ' ') {
// if(newString!=""){
// stack.push(newString);
// }
// newString = "";
// } else {
// newString += s.charAt(i);
// }
// }

// String ans = "";

// while(stack.size()!=1){
// ans+= stack.peek()+" ";
// stack.pop();
// }

// ans+=stack.peek();

// return ans;
// }
// }

class Solution {
    public String reverseWords(String s) {
        int left = 0;
        int right = s.length() - 1;

        String temp = "";
        String ans = "";

        while (left <= right) {
            char ch = s.charAt(left);
            if (ch != ' ') {
                temp += ch;
            } else if (ch == ' ') {
                if (!temp.isEmpty()) {
                    if (!ans.isEmpty()) {
                        ans = temp + " " + ans;
                    } else {
                        ans = temp;
                    }
                    temp = "";
                }
            }
            left++;
        }

        // Adding the last word if it exists
        if (!temp.isEmpty()) {
            if (!ans.isEmpty()) {
                ans = temp + " " + ans;
            } else {
                ans = temp;
            }
        }

        return ans;
    }
}

class Solution {
    public String reverseWords(String s) {
        int left = 0;
        int right = s.length() - 1;

        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        while (left <= right) {
            char ch = s.charAt(left);
            if (ch != ' ') {
                temp.append(ch);
            } else if (ch == ' ') {
                if (temp.length() > 0) {
                    if (ans.length() > 0) {
                        ans.insert(0, temp.toString() + " ");
                    } else {
                        ans.insert(0, temp.toString());
                    }
                    temp.setLength(0); // Clear the StringBuilder
                }
            }
            left++;
        }

        // Adding the last word if it exists
        if (temp.length() > 0) {
            if (ans.length() > 0) {
                ans.insert(0, temp.toString() + " ");
            } else {
                ans.insert(0, temp.toString());
            }
        }

        return ans.toString();
    }
}
