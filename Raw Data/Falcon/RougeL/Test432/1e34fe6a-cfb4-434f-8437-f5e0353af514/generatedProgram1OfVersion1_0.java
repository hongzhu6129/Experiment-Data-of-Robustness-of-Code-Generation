import java.util.HashMap;

public class SmallestWindowSubstring {

    public static String pickSubstring(String str, String pat) {
        if (str == null || pat == null || str.length() < pat.length()) {
            return "";
        }

        HashMap<Character, Integer> patMap = new HashMap<>();
        for (char c : pat.toCharArray()) {
            patMap.put(c, patMap.getOrDefault(c, 0) + 1);
        }

        int patCount = patMap.size();
        int strCount = 0;

        int minLen = Integer.MAX_VALUE;
        String minWindow = "";

        int left = 0;
        HashMap<Character, Integer> strMap = new HashMap<>();

        for (int right = 0; right < str.length(); right++) {
            char charRight = str.charAt(right);
            strMap.put(charRight, strMap.getOrDefault(charRight, 0) + 1);

            if (patMap.containsKey(charRight) && patMap.get(charRight).equals(strMap.get(charRight))) {
                strCount++;
            }

            while (strCount == patCount) {
                int currentLen = right - left + 1;
                if (currentLen < minLen) {
                    minLen = currentLen;
                    minWindow = str.substring(left, right + 1);
                }

                char charLeft = str.charAt(left);
                strMap.put(charLeft, strMap.get(charLeft) - 1);

                if (patMap.containsKey(charLeft) && strMap.get(charLeft) < patMap.get(charLeft)) {
                    strCount--;
                }

                left++;
            }

        }
        return minWindow;

    }

    public static void main(String[] args) {
        String string1 = "this is a test string";
        String string2 = "tist";

        String smallestWindow = pickSubstring(string1, string2);
        System.out.println("Smallest window containing all characters: " + smallestWindow); // Output: t stri

         string1 = "ADOBECODEBANC";
         string2 = "ABC";
        smallestWindow = pickSubstring(string1, string2);
        System.out.println("Smallest window containing all characters: " + smallestWindow); // Output: BANC


    }
}
