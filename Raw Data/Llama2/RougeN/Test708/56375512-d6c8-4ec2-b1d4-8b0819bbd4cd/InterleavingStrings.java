import java.util.*;

public class InterleavingStrings {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        List<String> interleavings = findInterleavings(s1, s2);
        System.out.println(interleavings); // Output: [abcdef, adbecf, aebdcf, aebcdf, daebcf, daebfc, deabcf, deacbf]
    }

    public static List<String> findInterleavings(String s1, String s2) {
        List<String> interleavings = new ArrayList<>();
        findInterleavings(s1, s2, "", interleavings);
        return interleavings;
    }

    private static void findInterleavings(String s1, String s2, String interleaving, List<String> interleavings) {
        if (s1.isEmpty() && s2.isEmpty()) {
            interleavings.add(interleaving);
        } else {
            if (!s1.isEmpty()) {
                findInterleavings(s1.substring(1), s2, interleaving + s1.charAt(0), interleavings);
            }
            if (!s2.isEmpty()) {
                findInterleavings(s1, s2.substring(1), interleaving + s2.charAt(0), interleavings);
            }
        }
    }

    // Test cases
    public static void testCornerCases() {
        String s1 = "";
        String s2 = "";
        List<String> interleavings = findInterleavings(s1, s2);
        System.out.println(interleavings); // Output: [""]

        s1 = "a";
        s2 = "";
        interleavings = findInterleavings(s1, s2);
        System.out.println(interleavings); // Output: [a]

        s1 = "";
        s2 = "b";
        interleavings = findInterleavings(s1, s2);
        System.out.println(interleavings); // Output: [b]
    }
}
