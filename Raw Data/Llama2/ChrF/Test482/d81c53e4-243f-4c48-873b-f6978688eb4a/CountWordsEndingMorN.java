import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordsEndingMorN {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        Pattern pattern = Pattern.compile("\\b\\w+[mnMN]\\b"); // Matches whole words ending in m or n (case-insensitive)
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountWordsEndingMorN counter = new CountWordsEndingMorN();
        String text1 = "The man from Amsterdam went home on fun";
        int count1 = counter.endWithmOrn(text1);
        System.out.println("Text 1 Count: " + count1); // Output should be 3 (Amsterdam, man, fun)

        String text2 = "Women and Men";
        int count2 = counter.endWithmOrn(text2);
        System.out.println("Text 2 Count: " + count2); // Output should be 2 (Women, Men)


        String text3 = null;  // Test null input
        int count3 = counter.endWithmOrn(text3);
        System.out.println("Text 3 Count: " + count3); // Output: 0

        String text4 = "   "; // Test empty string
        int count4 = counter.endWithmOrn(text4);
        System.out.println("Text 4 Count: " + count4); // Output 0

                String text5 = "M"; // Test single letter
        int count5 = counter.endWithmOrn(text5);
        System.out.println("Text 5 Count: " + count5); // Output 1

    }
}
