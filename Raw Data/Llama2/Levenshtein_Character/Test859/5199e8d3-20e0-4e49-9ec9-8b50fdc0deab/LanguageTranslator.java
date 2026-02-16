import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LanguageTranslator {

    public static void main(String[] args) {
        // Create a hash map to store the language translations
        Map<String, String> translations = new HashMap<>();

        // Add some sample translations to the hash map
        translations.put("Hello", "Hola");
        translations.put("Goodbye", "Adios");
        translations.put("Thank you", "Gracias");

        // Get the string to be translated from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to be translated: ");
        String input = scanner.nextLine();

        // Translate the string using the hash map
        String translation = translations.get(input);

        // Print the translated string
        System.out.println("The translated string is: " + translation);
    }
}
