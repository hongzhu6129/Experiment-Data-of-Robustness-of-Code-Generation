import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Using regex for a more robust solution handling various whitespace and punctuation.
        Pattern pattern = Pattern.compile("\\b\\w+[mnMN]\\b"); // Word boundary, one or more word chars, ending in m or n
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        String text1 = "man woman fan pen run swim";
        int count1 = wc.endWithmOrn(text1);
        System.out.println("Text 1 count: " + count1); // Output: 4 (man, woman, fan, pen)

        String text2 = "Mum doesn't program in Python.";
        int count2 = wc.endWithmOrn(text2);
        System.out.println("Text 2 count: " + count2); // Output: 2 (Mum, program)



         String text3 = null;
        int count3 = wc.endWithmOrn(text3); // handles null
        System.out.println("Text 3 count: " + count3); // Output: 0

         String text4 = ""; //empty string
        int count4 = wc.endWithmOrn(text4); 
        System.out.println("Text 4 count: " + count4); // Output: 0


        String text5 = "   ";  // Whitespace only
        int count5 = wc.endWithmOrn(text5); 
        System.out.println("Text 5 count: " + count5); // Output: 0

    }
}
