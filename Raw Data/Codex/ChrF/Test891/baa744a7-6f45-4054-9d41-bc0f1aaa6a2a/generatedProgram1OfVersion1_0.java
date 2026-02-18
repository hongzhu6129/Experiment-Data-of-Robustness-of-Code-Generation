import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCounter {

    public int endWithmOrn(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }

        // Use regex to find words ending in 'm' or 'n'
        Pattern pattern = Pattern.compile("\\b\\w*[mn]\\b"); // Matches whole words ending in m or n
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        WordCounter counter = new WordCounter();

        String text1 = "The man in the moon came home soon.";
        int count1 = counter.endWithmOrn(text1);
        System.out.println("Text 1 count: " + count1); // Expected: 2 (man, moon)

        String text2 = "Women and Men";
        int count2 = counter.endWithmOrn(text2);
        System.out.println("Text 2 count: " + count2); // Expected: 2 (Women, Men)


        String text3 = "m n";
        int count3 = counter.endWithmOrn(text3);
        System.out.println("Text 3 count: " + count3); // Expected: 2 (m, n)


        String text4 = "mn";
        int count4 = counter.endWithmOrn(text4);
        System.out.println("Text 4 count: " + count4); // Expected: 0 

        String text5 = null; //testing null
        int count5 = counter.endWithmOrn(text5);
        System.out.println("Text 5 count: " + count5); // Expected: 0

        String text6 = "";  //testing empty
        int count6 = counter.endWithmOrn(text6);
        System.out.println("Text 6 count: " + count6); // Expected: 0

        String text7 = "   "; // testing whitespace only
        int count7 = counter.endWithmOrn(text7);
        System.out.println("Text 7 count: " + count7); // Expected: 0
    }
}
