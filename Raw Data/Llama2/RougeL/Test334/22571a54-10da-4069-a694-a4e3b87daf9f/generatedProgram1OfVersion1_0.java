import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordsEndingMorN {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        Pattern pattern = Pattern.compile("\\b\\w*[mnMN]\\b"); // Word boundary, any word characters, ending m or n
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountWordsEndingMorN counter = new CountWordsEndingMorN();
        String text1 = "man sun gun run moon pen";
        int count1 = counter.endWithmOrn(text1);
        System.out.println("Number of words ending with 'm' or 'n' in \"" + text1 + "\": " + count1);


        String text2 = "Women Men Pin";
        int count2 = counter.endWithmOrn(text2);
        System.out.println("Number of words ending with 'm' or 'n' in \"" + text2 + "\": " + count2);


         String text3 = ""; // Empty string
        int count3 = counter.endWithmOrn(text3);
        System.out.println("Number of words ending with 'm' or 'n' in \"" + text3 + "\": " + count3);


        String text4 = null; // Null string
        int count4 = counter.endWithmOrn(text4);
        System.out.println("Number of words ending with 'm' or 'n' in \"" + text4 + "\": " + count4);



        String text5 = "   "; // Whitespace string
        int count5 = counter.endWithmOrn(text5);
        System.out.println("Number of words ending with 'm' or 'n' in \"" + text5 + "\": " + count5);


    }
}
