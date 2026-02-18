import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListProtagonists {

    public static void main(String[] args) {
        // Create a list of lists of protagonists
        List<List<String>> protagonists = new ArrayList<>();
        protagonists.add(Arrays.asList("Harry", "Hermione", "Ron"));
        protagonists.add(Arrays.asList("Luke", "Leia", "Han"));
        protagonists.add(Arrays.asList("Neo", "Trinity", "Morpheus"));

        // Print the protagonists in each list
        for (List<String> protagonistList : protagonists) {
            System.out.println(String.join(", ", protagonistList));
        }
    }
}
