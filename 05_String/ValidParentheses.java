import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution sl = new Solution();
        boolean ans = sl.isValid("()[]{}");

        System.out.println(ans);
    }
}

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();
//         for (int i = 0; i < s.length(); i++) {
//             char c = s.charAt(i);
//             if (c == '(' || c == '[' || c == '{')
//                 stack.push(c);
//             else {
//                 if (stack.isEmpty())
//                     return false;
//                 char pop = stack.pop();

//                 if ((pop == '(' && c != ')') ||
//                         (pop == '[' && c != ']') ||
//                         (pop == '{' && c != '}'))
//                     return false;
//             }
//         }
//         return stack.isEmpty();
//     }
// }
class Solution {
    public boolean isValid(String x) {
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<x.length();i++){
            char c = x.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }else{
                if(st.isEmpty())
                  return false;
                
                char pop = st.pop();
                System.out.println(pop);
                if((pop!='('&&c==')')||(pop!='['&&c==']')||(pop!='{'&&c=='}'))
                  return false;
            }
        }
        
        return st.isEmpty();
    }
}