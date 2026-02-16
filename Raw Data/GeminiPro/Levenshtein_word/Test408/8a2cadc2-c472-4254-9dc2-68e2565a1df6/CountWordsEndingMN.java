import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordsEndingMN {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Use a regular expression to find words ending in 'm' or 'n' (case-insensitive)
        Pattern pattern = Pattern.compile("\\b\\w*[mn]\\b", Pattern.CASE_INSENSITIVE); 
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        CountWordsEndingMN counter = new CountWordsEndingMN();

        String text1 = "Sam, jam,  RAM,  van,  man,  LAN, pan.";
        int count1 = counter.endWithmOrn(text1);
        System.out.println("Text 1 count: " + count1); // Output: 7

        String text2 = "Turn down for what! program PROGRAM problem Problem";
        int count2 = counter.endWithmOrn(text2);
        System.out.println("Text 2 count: " + count2); // Output: 3


        String text3 = null; // Test null input
        int count3 = counter.endWithmOrn(text3);
        System.out.println("Text 3 (null) count: " + count3); // Output: 0

        String text4 = "";  // Test empty input
        int count4 = counter.endWithmOrn(text4);
        System.out.println("Text 4 (empty) count: " + count4); // Output: 0

          String text5 = "   "; // Test whitespace-only input
        int count5 = counter.endWithmOrn(text5);
        System.out.println("Text 5 (whitespace only) count: " + count5); // Output: 0
    }
}
