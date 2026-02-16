import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListConverter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("HELLO", "World", "Java", "STREAMS");

        // Convert to digraphs (pairs of characters)
        List<String> digraphs = strings.stream()
                .flatMap(s -> {
                    // Handle strings with odd lengths by padding with a space
                    if (s.length() % 2 != 0) {
                        s += " ";
                    }
                    String[] pairs = new String[s.length() / 2];
                    for (int i = 0; i < s.length(); i += 2) {
                        pairs[i / 2] = s.substring(i, i + 2);
                    }
                    return Arrays.stream(pairs);
                })
                .collect(Collectors.toList());

        System.out.println("Digraphs: " + digraphs);


        // Convert to lowercase
        List<String> lowercaseStrings = strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Lowercase Strings: " + lowercaseStrings);


        //Example incorporating both operations sequentially (digraphs then lowercase)
        List<String> digraphsLowercase = strings.stream()
                .flatMap(s -> {
                    if (s.length() % 2 != 0) {
                        s += " ";
                    }
                    String[] pairs = new String[s.length() / 2];
                    for (int i = 0; i < s.length(); i += 2) {
                        pairs[i / 2] = s.substring(i, i + 2);
                    }
                    return Arrays.stream(pairs);
                })
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("Digraphs then Lowercase: " + digraphsLowercase);
    }
}
