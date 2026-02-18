import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringListConverter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("HELLO", "World", "Java", "StReaM", "EXAMPLE");

        // Convert to digraphs (pairs of characters)
        List<String> digraphs = strings.stream()
                .flatMap(s -> {
                    if (s.length() % 2 == 0) {
                        return s.chars()
                                .mapToObj(c -> String.valueOf((char) c))
                                .collect(Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> {
                                            List<String> pairs = new java.util.ArrayList<>();
                                            for (int i = 0; i < list.size(); i += 2) {
                                                pairs.add(list.get(i) + list.get(i + 1));
                                            }
                                            return pairs.stream();
                                        }))
                                .collect(Collectors.toList());
                    } else {  // Handle odd-length strings by adding a space at the end
                         return s.concat(" ").chars()
                                .mapToObj(c -> String.valueOf((char) c))
                                .collect(Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        list -> {
                                            List<String> pairs = new java.util.ArrayList<>();
                                            for (int i = 0; i < list.size(); i += 2) {
                                                pairs.add(list.get(i) + list.get(i + 1));
                                            }
                                            return pairs.stream();
                                        }))
                                .collect(Collectors.toList());
                    }
                })


                .collect(Collectors.toList());

        System.out.println("Digraphs: " + digraphs);


        // Convert to lowercase
        List<String> lowercaseStrings = strings.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println("Lowercase: " + lowercaseStrings);

    }
}
