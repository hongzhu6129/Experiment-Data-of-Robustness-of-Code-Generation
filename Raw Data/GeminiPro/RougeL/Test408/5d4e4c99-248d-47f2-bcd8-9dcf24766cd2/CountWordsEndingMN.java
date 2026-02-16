import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordsEndingMN {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Use regex to find words ending in 'm' or 'n' (case-insensitive)
        Pattern pattern = Pattern.compile("\\b\\w*[mnMN]\\b"); // \b for word boundaries
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        CountWordsEndingMN counter = new CountWordsEndingMN();
        String text1 = "The man from Boston couldn't swim.";
        String text2 = "Sam,  I am so happy to inform you that I got a plum job.";
        String text3 = ""; // Empty string
        String text4 = null; // Null string
        String text5 = "  "; // Whitespace only


        System.out.println("Text 1 Count: " + counter.endWithmOrn(text1)); // Output: 2 (man, swim)
        System.out.println("Text 2 Count: " + counter.endWithmOrn(text2)); // Output: 3 (Sam, am, inform)
        System.out.println("Text 3 Count: " + counter.endWithmOrn(text3)); // Output: 0
        System.out.println("Text 4 Count: " + counter.endWithmOrn(text4)); // Output: 0
        System.out.println("Text 5 Count: " + counter.endWithmOrn(text5)); // Output: 0


    }
}
