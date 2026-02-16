import java.util.HashSet;
import java.util.Set;

public class Interleavings {

    public static void allInterleavings(String str1, String str2, String current, Set<String> result) {
        if (str1.length() == 0 && str2.length() == 0) {
            result.add(current);
            return;
        }

        if (str1.length() > 0) {
            allInterleavings(str1.substring(1), str2, current + str1.charAt(0), result);
        }

        if (str2.length() > 0) {
            allInterleavings(str1, str2.substring(1), current + str2.charAt(0), result);
        }
    }

    public static void main(String[] args) {
        String str1 = "AB";
        String str2 = "CD";

        Set<String> interleavings = new HashSet<>();
        allInterleavings(str1, str2, "", interleavings);

        System.out.println("Interleavings of '" + str1 + "' and '" + str2 + "':");
        for (String interleaving : interleavings) {
            System.out.println(interleaving);
        }


        // Example with "flute" as requested in prompt (interleaving with ""):
        str1 = "flute";
        str2 = "";
        interleavings.clear(); // Clear the set for the next example
        allInterleavings(str1, str2, "", interleavings);

        System.out.println("\nInterleavings of '" + str1 + "' and '" + str2 + "':");
        for (String interleaving : interleavings) {
            System.out.println(interleaving);
        }
    }
}
