import java.util.HashMap;
import java.util.Map;

public class RemoveNearbyDuplicates {

    public static String removeNearbyDuplicates(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> lastIdxMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int lastIdx = lastIdxMap.getOrDefault(c, -1);

            if (i - lastIdx > 1) {
                sb.append(c);
                lastIdxMap.put(c, i);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "abbaca";
        String result1 = removeNearbyDuplicates(s1);
        System.out.println("Original: " + s1);
        System.out.println("Result: " + result1); // Expected: ca

        String s2 = "azxxzy";
        String result2 = removeNearbyDuplicates(s2);
        System.out.println("Original: " + s2);
        System.out.println("Result: " + result2); // Expected: ay

        String s3 = "aabbaa";
        String result3 = removeNearbyDuplicates(s3);
        System.out.println("Original: " + s3);
        System.out.println("Result: " + result3); // Expected: a

        String s4 = "a";
        String result4 = removeNearbyDuplicates(s4);
        System.out.println("Original: " + s4);
        System.out.println("Result: " + result4); // Expected: a

        String s5 = null;
        String result5 = removeNearbyDuplicates(s5);
        System.out.println("Original: " + s5);
        System.out.println("Result: " + result5); // Expected: null
    }
}
