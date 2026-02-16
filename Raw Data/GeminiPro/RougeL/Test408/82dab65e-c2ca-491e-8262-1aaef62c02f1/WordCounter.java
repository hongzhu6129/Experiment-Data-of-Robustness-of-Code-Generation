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
        WordCounter counter = new WordCounter();

        String text1 = "Sam, jam, program, man, woman, pen, run, pin";
        int count1 = counter.endWithmOrn(text1);
        System.out.println("Text 1 Count: " + count1); // Expected output: 6

        String text2 = "This is a Test string.  It should return 0.";
        int count2 = counter.endWithmOrn(text2);
        System.out.println("Text 2 Count: " + count2); // Expected output: 0


        String text3 = null;
        int count3 = counter.endWithmOrn(text3);
        System.out.println("Text 3 Count (null): " + count3); // Expected output: 0

        String text4 = "   "; // Empty string after trimming
        int count4 = counter.endWithmOrn(text4);
        System.out.println("Text 4 Count (empty): " + count4); // Expected output: 0


        String text5 = "m Mn";
        int count5 = counter.endWithmOrn(text5);
        System.out.println("Text 5 Count : " + count5); // Expected output: 2

    }
}

