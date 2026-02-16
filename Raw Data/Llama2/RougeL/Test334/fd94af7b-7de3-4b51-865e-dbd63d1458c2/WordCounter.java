import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Use regex to find words ending in 'm' or 'n' (case-insensitive)
        Pattern pattern = Pattern.compile("\\b\\w*[mn]\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        WordCounter counter = new WordCounter();

        String text1 = "Sam, son, woman, man, cinnamon";
        int count1 = counter.endWithmOrn(text1);
        System.out.println("Text 1 count: " + count1); // Expected output: 5

        String text2 = "plum, orange, banana";
        int count2 = counter.endWithmOrn(text2);
        System.out.println("Text 2 count: " + count2); // Expected output: 1


        String text3 = "";  // Empty string
        int count3 = counter.endWithmOrn(text3);
        System.out.println("Text 3 count: " + count3); // Expected: 0

        String text4 = null; // Null string
        int count4 = counter.endWithmOrn(text4);
        System.out.println("Text 4 count: " + count4); // Expected: 0

        String text5 = "   "; // Whitespace only
        int count5 = counter.endWithmOrn(text5);
        System.out.println("Text 5 count: " + count5); // Expected: 0


        String text6 = "m Mn"; // single letter words and mixed case
        int count6 = counter.endWithmOrn(text6);
        System.out.println("Text 6 count: " + count6); // Expected: 2
    }
}

