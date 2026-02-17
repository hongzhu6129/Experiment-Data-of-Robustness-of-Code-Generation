import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordsEndingMN {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        Pattern pattern = Pattern.compile("\\b\\w+[mM|nN]\\b"); // Word boundary, one or more word chars, m/M or n/N, word boundary
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountWordsEndingMN counter = new CountWordsEndingMN();
        String text1 = "man sun gun MOON pen program";
        int count1 = counter.endWithmOrn(text1);
        System.out.println("Text 1 Count: " + count1); // Expected: 4 (man, sun, gun, pen)

        String text2 = "This is a sample program in Java, written by Sam.";
        int count2 = counter.endWithmOrn(text2);
        System.out.println("Text 2 Count: " + count2); // Expected: 1 (Sam)

        String text3 = ""; // Empty string
        int count3 = counter.endWithmOrn(text3);
        System.out.println("Text 3 Count: " + count3); // Expected: 0


        String text4 = null; // Null string
        int count4 = counter.endWithmOrn(text4);
        System.out.println("Text 4 Count: " + count4); // Expected: 0

        String text5 = "item,column"; // Test words ending in m/n but followed by punctuation.
        int count5 = counter.endWithmOrn(text5);
        System.out.println("Text 5 Count: " + count5); // Expected: 2


    }
}
