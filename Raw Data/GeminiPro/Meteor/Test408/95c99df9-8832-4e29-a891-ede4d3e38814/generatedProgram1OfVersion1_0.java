import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Use a regular expression to find words ending with m or n (case-insensitive)
        Pattern pattern = Pattern.compile("\\b\\w*[mnMN]\\b"); // \b matches word boundaries
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        WordCount wc = new WordCount();

        String text1 = "Sam, jam, dam, fan, pan, Man, woman";
        int count1 = wc.endWithmOrn(text1);
        System.out.println("Text 1 count: " + count1); // Output: 7

        String text2 = "This is a simple program";
        int count2 = wc.endWithmOrn(text2);
        System.out.println("Text 2 count: " + count2); // Output: 1

        String text3 = null; // Test null input 
        int count3 = wc.endWithmOrn(text3);
        System.out.println("Text 3 (null) count: " + count3); // Output: 0


        String text4 = ""; // Test empty input
        int count4 = wc.endWithmOrn(text4);
        System.out.println("Text 4 (empty) count: " + count4); // Output: 0

        String text5 = "   ";  // Test whitespace-only input
        int count5 = wc.endWithmOrn(text5);
        System.out.println("Text 5 (whitespace) count: " + count5); // Output: 0



        String text6 = "M, N, m ,n"; // Test single-letter words
        int count6 = wc.endWithmOrn(text6);
        System.out.println("Text 6 count: " + count6); // Output: 4


    }
}
