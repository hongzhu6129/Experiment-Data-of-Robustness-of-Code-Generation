import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchG {

    public static void main(String[] args) {
        String[] words = {"green", "programming", "google", "eggs", "dogmatic", "glow"};

        for (String word : words) {
            String result = validate(word);
            System.out.println(word + ": " + result);
        }
    }

    public static String validate(String word) {
        // Regular expression:  Matches 'g' not at the start or end, with at least one character before and after.
        Pattern pattern = Pattern.compile(".+g.+"); 
        Matcher matcher = pattern.matcher(word);

        if (matcher.matches()) {
            return "Match";
        } else {
            return "No Match";
        }
    }
}
