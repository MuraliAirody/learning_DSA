import java.util.*;

public class PermutationString {
    public static void main(String[] args) {
        String s = "ABC";
        SolutionPermutationString obj = new SolutionPermutationString();
        List<String> ans = obj.find_permutation(s);


        ans.stream().forEach((ss) -> System.out.println(ss));

    }
}

class SolutionPermutationString {
    public List<String> find_permutation(String S) {

        HashSet<String> set = new HashSet<>();
        permute(S.toCharArray(), 0, set);

        ArrayList<String> list = new ArrayList<>(set);

        Collections.sort(list);

        return list;
    }

    public static void permute(char[] s, int fi, HashSet<String> set) {
        if (fi == s.length - 1) {
            // System.out.println("tt -> "+String.valueOf(s));
            set.add(String.valueOf(s));
            return;
        } else {
            for (int i = fi; i < s.length; i++) {
                swap(s, fi, i);
                permute(s, fi + 1, set);
                swap(s, fi, i);
            }
        }
    }

    public static void swap(char[] s, int fi, int i) {
        char temp = s[fi];
        s[fi] = s[i];
        s[i] = temp;
    }
}