import java.util.HashSet;
import java.util.Set;

public class StringInterleavings {

    public static void allInterleavings(String str1, String str2, String current, Set<String> interleavings) {
        if (str1.length() == 0 && str2.length() == 0) {
            interleavings.add(current);
            return;
        }

        if (str1.length() > 0) {
            allInterleavings(str1.substring(1), str2, current + str1.charAt(0), interleavings);
        }

        if (str2.length() > 0) {
            allInterleavings(str1, str2.substring(1), current + str2.charAt(0), interleavings);
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


        str1 = "AB";
        str2 = "C";
         interleavings = new HashSet<>();
        allInterleavings(str1, str2, "", interleavings);

        System.out.println("\nInterleavings of '" + str1 + "' and '" + str2 + "':");
        for (String interleaving : interleavings) {
            System.out.println(interleaving);
        }
    }
}
