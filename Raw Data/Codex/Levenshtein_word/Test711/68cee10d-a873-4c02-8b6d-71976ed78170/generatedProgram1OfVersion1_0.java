import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchG {

    public static void main(String[] args) {
        String[] words = {"green", "google", "g", "egg", "age", "gaming"};

        for (String word : words) {
            String result = validate(word);
            System.out.println(word + ": " + result);
        }
    }

    public static String validate(String word) {
        // Regular expression to match 'g' not at the start or end
        Pattern pattern = Pattern.compile("\\b\\w+g\\w+\\b");
        Matcher matcher = pattern.matcher(word);

        if (matcher.matches()) {
            return "Match";
        } else {
            return "No Match";
        }
    }
}
