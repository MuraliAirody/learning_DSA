import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewQues {
    public static void main(String[] args) {
        // How do you remove duplicate elements from a list using Java 8 streams?
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        List<String> unique = listOfStrings.stream().distinct().collect(Collectors.toList());

        for (String s : unique)
            System.out.println(s);

        // How do you find frequency of each character in a string using Java 8 streams?
        String inputString = "Java Concept Of The Day";
        Map<Character, Long> frequency = inputString.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(c->(char)c, Collectors.counting()));
        System.out.println(frequency);
    }
}
