import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Use regular expression to find words ending with m or n (case-insensitive)
        Pattern pattern = Pattern.compile("\\b\\w*[mnMN]\\b"); // \b for word boundaries
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        WordCounter counter = new WordCounter();

        String text1 = "The man from Rome took an exam";
        int count1 = counter.endWithmOrn(text1);
        System.out.println("Text 1 Count: " + count1); // Expected: 3 (man, from, exam)

        String text2 = "mum, moon, noon";
        int count2 = counter.endWithmOrn(text2);
        System.out.println("Text 2 Count: " + count2);  // Expected: 3

        String text3 = ""; // Empty string
        int count3 = counter.endWithmOrn(text3);
        System.out.println("Text 3 Count: " + count3); // Expected 0

        String text4 = null; // Null string
        int count4 = counter.endWithmOrn(text4);
        System.out.println("Text 4 Count: " + count4); // Expected 0

         String text5 = "   "; // Whitespace only
        int count5 = counter.endWithmOrn(text5);
        System.out.println("Text 5 Count: " + count5); // Expected 0

    }
}
