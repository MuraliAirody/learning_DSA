import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagarm {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagram(strs));
    }

    public static List<List<String>> groupAnagram(String[] strs){
        Map<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            int[] ch = new int[26];

            for(char c:s.toCharArray()){
                ch[c-'a']++;
            }

            String str = Arrays.toString(ch);
            map.computeIfAbsent(str, k->new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}