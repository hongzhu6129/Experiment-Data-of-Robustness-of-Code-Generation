import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;

public class ListAvailableCharsets {

    public static void listCharsets() {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        // Using an iterator for demonstration, you can also use other looping methods
        Iterator<String> iterator = charsets.keySet().iterator();
        while (iterator.hasNext()) {
            String charsetName = iterator.next();
            Charset charset = charsets.get(charsetName);
            System.out.println(charsetName + ": " + charset.displayName());

            // Optional: Print aliases if needed
            Set<String> aliases = charset.aliases();
            if (!aliases.isEmpty()) {
                System.out.println("  Aliases: " + String.join(", ", aliases));
            }
        }

       System.out.println("Total available charsets: " + charsets.size());

    }




    public static void main(String[] args) {
        listCharsets();

    }
}


