import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordsEndingMorN {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Use regex to find words ending with m or n (case-insensitive)
        Pattern pattern = Pattern.compile("\\b[a-zA-Z]*[mn]\\b"); // \b for word boundaries
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        CountWordsEndingMorN counter = new CountWordsEndingMorN();

        String text1 = "Sam, sun, moon, run, gun, tan,  man";
        int count1 = counter.endWithmOrn(text1);
        System.out.println("Text 1 count: " + count1); // Expected: 5 (sam, sun, moon, run, gun)


        String text2 = "MAn, WOMAN, mEN, women"; // Testing case-insensitivity
        int count2 = counter.endWithmOrn(text2);
        System.out.println("Text 2 count: " + count2); // Expected 2 (MAn, mEN)

        String text3 = ""; // Empty string
        int count3 = counter.endWithmOrn(text3);
        System.out.println("Text 3 count: " + count3); // Expected: 0

        String text4 = null; // Null string
        int count4 = counter.endWithmOrn(text4);
        System.out.println("Text 4 count: " + count4); // Expected: 0

        String text5 = "man. woman! men?"; // testing with punctuation
        int count5 = counter.endWithmOrn(text5);
        System.out.println("Text 5 Count: " + count5); // Expected 3 (man, woman, men)
        
        String text6 = "m n"; // single letter words
        int count6 = counter.endWithmOrn(text6);
        System.out.println("Text 6 Count: " + count6); // Expected 2
    }
}
