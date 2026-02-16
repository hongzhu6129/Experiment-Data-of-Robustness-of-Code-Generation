import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSort {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "grape");

        List<String> sortedStrings = strings.stream()
                .sorted(Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.toList());

        System.out.println(sortedStrings); 
    }
}
