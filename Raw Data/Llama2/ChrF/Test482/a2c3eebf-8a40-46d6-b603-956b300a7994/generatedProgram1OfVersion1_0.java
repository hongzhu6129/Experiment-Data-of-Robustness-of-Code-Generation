import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Using regex to find words ending with m or n (case-insensitive)
        Pattern pattern = Pattern.compile("\\b\\w+[mnMN]\\b"); // \b for word boundaries
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }


    public static void main(String[] args) {
        WordCount wc = new WordCount();

        String text1 = "man bun pen fun sum chum run drum";
        int count1 = wc.endWithmOrn(text1);
        System.out.println("Text 1 count: " + count1); // Expected: 5 (man, bun, sum, chum, run)


        String text2 = "Women and Men";
        int count2 = wc.endWithmOrn(text2);
        System.out.println("Text 2 count: " + count2); // Expected: 2 (Women, Men)


        String text3 =  "M m n N"; // Test single letter words and case insensitivity
        int count3 = wc.endWithmOrn(text3);
        System.out.println("Text 3 count: " + count3); // Expected: 4

         String text4 = null; // Test null input
        int count4 = wc.endWithmOrn(text4);
        System.out.println("Text 4 count: " + count4); // Expected: 0

        String text5 = " "; // Test empty string
        int count5 = wc.endWithmOrn(text5);
        System.out.println("Text 5 count: " + count5); // Expected: 0


        String text6 = "item,column."; // Test with punctuation
        int count6 = wc.endWithmOrn(text6);
        System.out.println("Text 6 count: " + count6); // Expected: 2 (item, column)


    }
}
