import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

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
        WordCount wc = new WordCount();

        String text1 = "Sam, jam,  cream, and ham, green, bean, mean.";
        int count1 = wc.endWithmOrn(text1);
        System.out.println("Text 1 Count: " + count1); // Expected: 5 (sam, cream, ham, green, bean)


        String text2 = "Man, men, women, woman, run, ran, rum";
        int count2 = wc.endWithmOrn(text2);
        System.out.println("Text 2 Count: " + count2); // Expected: 4

        String text3 = null;
        int count3 = wc.endWithmOrn(text3);
        System.out.println("Text 3 Count (null): " + count3); // Expected: 0

        String text4 = "";
        int count4 = wc.endWithmOrn(text4);
        System.out.println("Text 4 Count (empty): " + count4); // Expected: 0

         String text5 = "   "; // Whitespace only
        int count5 = wc.endWithmOrn(text5);
        System.out.println("Text 5 Count (whitespace): " + count5); // Expected: 0
    }
}
