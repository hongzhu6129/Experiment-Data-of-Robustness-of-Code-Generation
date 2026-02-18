import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCounter {

    public int endWithmOrn(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        // Use regex to find phrases ending with m or n (case-insensitive)
        Pattern pattern = Pattern.compile("\\b\\w+[mM]|[nN]\\b"); // Word boundary, one or more word chars, m or n
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        StringCounter counter = new StringCounter();

        String text1 = "Sam, man, program, woman";
        int count1 = counter.endWithmOrn(text1);
        System.out.println("Text 1 count: " + count1); // Output: 3

        String text2 = "Morn, noon, program, run";
        int count2 = counter.endWithmOrn(text2);
        System.out.println("Text 2 count: " + count2);  // Output: 2


        String text3 = "This is a Test String with NO matching words.";
        int count3 = counter.endWithmOrn(text3);
        System.out.println("Text 3 count: " + count3);  // Output: 0


        String text4 = null; // Test null input
        int count4 = counter.endWithmOrn(text4);
        System.out.println("Text 4 count: " + count4);  // Output: 0

        String text5 = "";  // Test empty string
        int count5 = counter.endWithmOrn(text5);
        System.out.println("Text 5 count: " + count5);  // Output: 0

         String text6 = "item Item autumn Autumn";
        int count6 = counter.endWithmOrn(text6);
        System.out.println("Text 6 count: " + count6);  // Output: 4
    }
}
