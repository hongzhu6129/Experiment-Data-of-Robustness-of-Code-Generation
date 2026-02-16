import java.util.ArrayList;
import java.util.List;

public class CheckWordCharsInList {

    static void checkExistance(String word, String listItem) {
        boolean containsAllChars = true;
        for (char c : word.toCharArray()) {
            if (listItem.indexOf(c) == -1) {
                containsAllChars = false;
                break;
            }
        }
        if (containsAllChars) {
            System.out.println(listItem);
        }
    }

    public static void main(String[] args) {
        String word = "sun";
        List<String> listItems = new ArrayList<>();
        listItems.add("sunday");
        listItems.add("unsung");
        listItems.add("round");
        listItems.add("sound");

        System.out.println("List items containing all characters of '" + word + "':");
        for (String item : listItems) {
            checkExistance(word, item);
        }
    }
}
