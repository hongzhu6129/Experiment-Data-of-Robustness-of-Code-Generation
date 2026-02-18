import java.util.regex.*;

public class WildcardChords {

    public static void main(String[] args) {
        String[] chords = {"Am", "C", "G"};

        // Create a regular expression that matches chords with a minor third
        Pattern pattern = Pattern.compile(".*m.*");

        // Iterate over the chords and print any that match the pattern
        for (String chord : chords) {
            if (pattern.matcher(chord).matches()) {
                System.out.println(chord);
            }
        }
    }
}
