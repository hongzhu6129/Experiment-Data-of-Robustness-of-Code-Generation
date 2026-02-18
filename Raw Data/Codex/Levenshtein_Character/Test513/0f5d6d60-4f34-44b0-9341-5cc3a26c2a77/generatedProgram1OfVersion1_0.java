import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Use regex to find words ending with m or n (case-insensitive)
        Pattern pattern = Pattern.compile("\\b\\w+[mnMN]\\b"); // \b for word boundaries
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();

        String text1 = "sam sun am men women TEN man ran";
        int count1 = wc.endWithmOrn(text1);
        System.out.println("Text 1 Count: " + count1); // Expected: 6

        String text2 = "Mum doesn't program in Python.";
        int count2 = wc.endWithmOrn(text2);
        System.out.println("Text 2 Count: " + count2); // Expected: 1


        String text3 = null;
        int count3 = wc.endWithmOrn(text3);
        System.out.println("Text 3 Count (null): " + count3); // Expected: 0


        String text4 = "   "; // Empty after trimming
        int count4 = wc.endWithmOrn(text4);
        System.out.println("Text 4 Count (empty): " + count4); // Expected: 0
        
        String text5 = "item items ITEM ITEMS Item"; // Test case-insensitivity
        int count5 = wc.endWithmOrn(text5);
        System.out.println("Text 5 Count (case-insensitive): " + count5); // Expected: 5
    }
}
