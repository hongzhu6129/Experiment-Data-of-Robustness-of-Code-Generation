import java.util.Arrays;
import java.util.List;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Orange", "Grape", "Apricot");

        // Count strings starting with 'A'
        long countA = strings.stream()
                .filter(s -> s.startsWith("A"))
                .count();

        System.out.println("Number of strings starting with 'A': " + countA);


        // Example with a different starting letter ('O')
        long countO = strings.stream()
                .filter(s -> s.startsWith("O"))
                .count();
        System.out.println("Number of strings starting with 'O': " + countO);


        //More generalized example: Count strings starting with any uppercase vowel
        long countVowel = strings.stream().filter(s -> "AEIOU".contains(String.valueOf(s.charAt(0)))).count();

        System.out.println("Number of strings starting with an uppercase vowel: "+countVowel);



    }
}
