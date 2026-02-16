import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Use regex to find words ending with m or n (case-insensitive)
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

        String text1 = "man woman fan pen run drum";
        System.out.println("Text 1 Count: " + wc.endWithmOrn(text1)); // Output: 4

        String text2 = "Mum is coming soon";
        System.out.println("Text 2 Count: " + wc.endWithmOrn(text2)); // Output: 1 (Mum, case-insensitive)

         String text3 = ""; // Empty string
        System.out.println("Text 3 Count: " + wc.endWithmOrn(text3)); // Output: 0

        String text4 = null; // Null string
        System.out.println("Text 4 Count: " + wc.endWithmOrn(text4)); // Output: 0


        String text5 = "   ";  // Whitespace only
        System.out.println("Text 5 Count: " + wc.endWithmOrn(text5)); // Output: 0

        String text6 = "item items ITEM ITEMS";
        System.out.println("Text 6 Count: " + wc.endWithmOrn(text6)); // Output: 4 (Case-insensitive)




    }
}
