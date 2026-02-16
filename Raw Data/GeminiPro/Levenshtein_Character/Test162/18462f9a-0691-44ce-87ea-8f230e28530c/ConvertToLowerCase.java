import java.util.Locale;

public class ConvertToLowerCase {

    public static void main(String[] args) {
        String input = "HELLO WORLD";
        String output = input.toLowerCase(Locale.ROOT);
        System.out.println(output); // hello world
    }
}
