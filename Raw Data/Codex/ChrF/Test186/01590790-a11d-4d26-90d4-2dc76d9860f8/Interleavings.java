import java.util.ArrayList;
import java.util.List;

public class Interleavings {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "de";
        List<String> interleavings = findInterleavings(s1, s2);
        System.out.println("Interleavings: " + interleavings);
    }

    public static List<String> findInterleavings(String s1, String s2) {
        List<String> interleavings = new ArrayList<>();
        return findInterleavings(s1, s2, interleavings, "");
    }

    private static List<String> findInterleavings(String s1, String s2, List<String> interleavings, String interleaving) {
        if (s1.isEmpty() && s2.isEmpty()) {
            interleavings.add(interleaving);
            return interleavings;
        }

        if (!s1.isEmpty()) {
            findInterleavings(s1.substring(1), s2, interleavings, interleaving + s1.charAt(0));
        }

        if (!s2.isEmpty()) {
            findInterleavings(s1, s2.substring(1), interleavings, interleaving + s2.charAt(0));
        }

        return interleavings;
    }
}
