import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchG {

    public static void main(String[] args) {
        String[] words = {"green", "programming", "grammar", "golf", "egg", "large", "dog"};

        for (String word : words) {
            String result = validate(word);
            System.out.println(word + ": " + result);
        }
    }

    public static String validate(String word) {
        // Regular expression to match 'g' not at the beginning or end
        Pattern pattern = Pattern.compile("^.[^g]*g[^g]*.$"); 
        Matcher matcher = pattern.matcher(word);
        return matcher.matches() ? "Match" : "No Match";
    }
}
