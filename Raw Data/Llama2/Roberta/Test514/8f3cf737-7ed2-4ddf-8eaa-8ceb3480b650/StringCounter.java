import java.util.ArrayList;
import java.util.List;

public class StringCounter {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("apricot");
        strings.add("avocado");
        strings.add("blueberry");

        char startingLetter = 'a'; // The letter to check against

        int count = countStringsStartingWith(strings, startingLetter);

        System.out.println("Number of strings starting with '" + startingLetter + "': " + count);
    }


    public static int countStringsStartingWith(List<String> strings, char startingLetter) {
        int count = 0;
        for (String str : strings) {
            if (!str.isEmpty() && str.charAt(0) == startingLetter) {
                count++;
            }
        }
        return count;
    }
}
