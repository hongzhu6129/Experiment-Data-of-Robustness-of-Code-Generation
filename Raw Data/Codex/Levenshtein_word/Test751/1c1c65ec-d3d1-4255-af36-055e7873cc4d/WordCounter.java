import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Using regex for case-insensitive matching of words ending in 'm' or 'n'
        Pattern pattern = Pattern.compile("\\b\\w*[mnMN]\\b"); // \b for word boundaries
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();

        String text1 = "Sam bats program, sun, moon";
        int count1 = wc.endWithmOrn(text1);
        System.out.println("Text 1 Count: " + count1); // Output: 3 (Sam, program, sun)


        String text2 = "This is a simple test with some words ending in M or N.";
        int count2 = wc.endWithmOrn(text2);
        System.out.println("Text 2 Count: " + count2); // Output: 1 (some)


        String text3 = null;  // Test with null input
        int count3 = wc.endWithmOrn(text3);
        System.out.println("Text 3 Count: " + count3);  // Output: 0

        String text4 = "   "; // Test with whitespace-only input
        int count4 = wc.endWithmOrn(text4);
        System.out.println("Text 4 Count: " + count4); // Output: 0

        String text5 = "man men women children"; // multiple matches
        int count5 = wc.endWithmOrn(text5);
        System.out.println("Text 5 Count: " + count5); // Output: 4
    }
}
