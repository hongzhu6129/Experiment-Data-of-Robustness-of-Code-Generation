import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Use regex to find words ending with m or n.  \b ensures word boundary.
        Pattern pattern = Pattern.compile("\\b\\w*[mn]\\b"); // \b matches word boundaries
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();

        String text1 = "The man from Boston couldn't swim";
        int count1 = wc.endWithmOrn(text1);
        System.out.println("Text 1 Count: " + count1); // Expected: 2 (man, swim)

        String text2 = "item woman William women";
        int count2 = wc.endWithmOrn(text2);
        System.out.println("Text 2 Count: " + count2); // Expected: 3 (item, woman, William)

        String text3 = "random";
        int count3 = wc.endWithmOrn(text3);
        System.out.println("Text 3 Count: " + count3); // Expected 1 (random)


        String text4 = null;
        int count4 = wc.endWithmOrn(text4);
        System.out.println("Text 4 Count: " + count4); // Expected 0

        String text5 = "";
        int count5 = wc.endWithmOrn(text5);
        System.out.println("Text 5 Count: " + count5); // Expected 0
         String text6 = "   "; // Spaces
        int count6 = wc.endWithmOrn(text6);
        System.out.println("Text 6 Count: " + count6); // Expected 0

    }
}
