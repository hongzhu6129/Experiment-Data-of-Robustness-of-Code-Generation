import java.nio.charset.Charset;
import java.util.SortedMap;

public class ListAvailableCharsets {

    public static void listCharsets() {
        SortedMap<String, Charset> charsets = Charset.availableCharsets();

        System.out.println("Available Character Sets:");
        for (String charsetName : charsets.keySet()) {
            Charset charset = charsets.get(charsetName);
            System.out.println(charsetName + " (aliases: " + charset.aliases() + ")");
        }
    }


    public static void main(String[] args) {
        listCharsets();
    }
}


