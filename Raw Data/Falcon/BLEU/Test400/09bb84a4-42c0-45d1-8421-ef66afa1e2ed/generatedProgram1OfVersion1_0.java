import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Use regular expression to find words ending with m or n (case-insensitive)
        Pattern pattern = Pattern.compile("\\b\\w+[mM]?\\b|\\b\\w+[nN]?\\b"); // Matches words ending in m/M or n/N
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        
        return count;
    }

    public static void main(String[] args) {
        WordCount wc = new WordCount();

        String text1 = "The man from Amsterdam went to Yemen";
        int count1 = wc.endWithmOrn(text1);
        System.out.println("Text 1 Count: " + count1); // Expected: 2 (Amsterdam, Yemen)

        String text2 = "mum, mom, moon";
        int count2 = wc.endWithmOrn(text2);
        System.out.println("Text 2 Count: " + count2); // Expected: 3

        String text3 = "Learn Java Programming"; // Case-insensitive
        int count3 = wc.endWithmOrn(text3);
        System.out.println("Text 3 Count: " + count3);  // Expected 1 (Programming)

        String text4 = null; // Handle null
        int count4 = wc.endWithmOrn(text4);
        System.out.println("Text 4 Count: " + count4);  // Expected 0

         String text5 = ""; // Handle empty string
        int count5 = wc.endWithmOrn(text5);
        System.out.println("Text 5 Count: " + count5);  // Expected 0

        String text6 = "   "; // Handle whitespace only
        int count6 = wc.endWithmOrn(text6);
        System.out.println("Text 6 Count: " + count6);  // Expected 0

        String text7 = "man man man woman fan run";
        int count7 = wc.endWithmOrn(text7);
        System.out.println("Text 7 Count: " + count7);  // Expected 6



    }
}
