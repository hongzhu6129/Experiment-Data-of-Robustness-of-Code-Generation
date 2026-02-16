import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

public class ListAvailableCharsets {

    public static void listCharsets() {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        System.out.println("Available Character Sets:");

        Iterator<String> iterator = charsets.keySet().iterator();
        while (iterator.hasNext()) {
            String charsetName = iterator.next();
            Charset charset = charsets.get(charsetName);
            System.out.println(charsetName + ": " + charset.displayName());

            // Optionally display aliases:
            //System.out.println("    Aliases: " + charset.aliases()); 
        }
    }



    public static void main(String[] args) {
        listCharsets();
    }
}

