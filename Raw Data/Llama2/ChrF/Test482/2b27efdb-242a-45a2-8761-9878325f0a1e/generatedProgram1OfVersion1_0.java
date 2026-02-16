import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Using regex for efficiency and case-insensitivity
        Pattern pattern = Pattern.compile("\\b\\w+[mnMN]\\b"); // Matches whole words ending in m or n
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
        System.out.println("Text 1 count: " + count1); // Expected: 2 (Amsterdam, Yemen)


        String text2 = "mum doesn't hum, or strum, but sometimes WHIMpers";
        int count2 = wc.endWithmOrn(text2);
        System.out.println("Text 2 count: " + count2); // Expected 1 (hum) Note: WHIMpers fails the word boundary check

        String text3 = null;
        int count3 = wc.endWithmOrn(text3);
        System.out.println("Text 3 (null) count : " + count3); // Expected 0

        String text4 = "";
        int count4 = wc.endWithmOrn(text4);
        System.out.println("Text 4 (empty) count: " + count4); // Expected 0

        String text5 = "   "; // Whitespace only
        int count5 = wc.endWithmOrn(text5);
        System.out.println("Text 5 (whitespace) count: " + count5); // Expected 0


        String text6 = "man Man mAn MaN men MEN";
        int count6 = wc.endWithmOrn(text6);
        System.out.println("Text 6 (case insensitive) count: " + count6); // Expected 6



    }
}

