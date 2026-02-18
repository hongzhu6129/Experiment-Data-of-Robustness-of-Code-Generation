import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Use a regular expression to find words ending in 'm' or 'n' (case-insensitive)
        Pattern pattern = Pattern.compile("\\b\\w*[mnMN]\\b"); // \b for word boundaries
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        WordCount wc = new WordCount();

        String text1 = "The man from Amsterdam saw a woman swim.";
        int count1 = wc.endWithmOrn(text1);
        System.out.println("Text 1 word count: " + count1); // Expected output: 3 (man, Amsterdam, swim)


        String text2 = "Mum, an elephant can swim!";
        int count2 = wc.endWithmOrn(text2);
        System.out.println("Text 2 word count: " + count2); // Expected Output: 2 (Mum, can)

        String text3 = null;
        int count3 = wc.endWithmOrn(text3);
        System.out.println("Text 3 word count (null): " + count3);  // Expected 0

        String text4 = "";
        int count4 = wc.endWithmOrn(text4);
        System.out.println("Text 4 word count (empty): " + count4);  // Expected 0


        String text5 = "   ";  // Whitespace only
        int count5 = wc.endWithmOrn(text5);
        System.out.println("Text 5 word count (whitespace): " + count5);  // Expected 0


        String text6 = "M";
        int count6 = wc.endWithmOrn(text6);
        System.out.println("Text 6 word count (single letter): " + count6); // Expected 1
    }
}

