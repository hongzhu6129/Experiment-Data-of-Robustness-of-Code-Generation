import java.util.ArrayList;
import java.util.List;

public class CheckCharacters {

    static void checkExistance(String item, String languageChars) {
        boolean containsAll = true;
        for (char langChar : languageChars.toCharArray()) {
            if (item.indexOf(langChar) == -1) {
                containsAll = false;
                break;
            }
        }
        if (containsAll) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        String languageChars = "java"; // Characters defining the "language"
        List<String> items = new ArrayList<>();
        items.add("javascript"); 
        items.add("java");
        items.add("avaj");
        items.add("python");
        items.add("vaja");


        System.out.println("Items containing all characters of '" + languageChars + "':");

        for (String item : items) {
            checkExistance(item, languageChars);
        }
    }
}
