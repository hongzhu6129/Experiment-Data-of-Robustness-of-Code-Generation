import java.util.HashMap;

public class SmallestWindowSubstring {

    public static String pickSubstring(String str, String pat) {
        if (pat.length() > str.length()) {
            return "";
        }

        HashMap<Character, Integer> patFreq = new HashMap<>();
        for (char c : pat.toCharArray()) {
            patFreq.put(c, patFreq.getOrDefault(c, 0) + 1);
        }

        int windowStart = 0;
        int matched = 0;
        int minWindowLength = Integer.MAX_VALUE;
        String minWindow = "";

        HashMap<Character, Integer> windowFreq = new HashMap<>();

        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (patFreq.containsKey(rightChar)) {
                windowFreq.put(rightChar, windowFreq.getOrDefault(rightChar, 0) + 1);
                if (windowFreq.get(rightChar).equals(patFreq.get(rightChar))) {
                    matched++;
                }
            }

            while (matched == patFreq.size()) {
                int currentWindowLength = windowEnd - windowStart + 1;
                if (currentWindowLength < minWindowLength) {
                    minWindowLength = currentWindowLength;
                    minWindow = str.substring(windowStart, windowEnd + 1);
                }

                char leftChar = str.charAt(windowStart);
                if (patFreq.containsKey(leftChar)) {
                    windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);
                    if (windowFreq.get(leftChar) < patFreq.get(leftChar)) {
                        matched--;
                    }
                }

                windowStart++;
            }
        }


        return minWindow;
    }


    public static void main(String[] args) {
        String str = "ADOBECODEBANC";
        String pat = "ABC";
        System.out.println("Smallest window containing all characters of '" + pat + "' is: " + pickSubstring(str, pat)); // Output: BANC

        str = "this is a test string";
        pat = "tist";
        System.out.println("Smallest window containing all characters of '" + pat + "' is: " + pickSubstring(str, pat)); // Output: t stri

        str = "zoomlazapzo";
        pat = "oza";
        System.out.println("Smallest window containing all characters of '" + pat + "' is: " + pickSubstring(str, pat));  // Output: zap

          str = "ab";
          pat = "b";  // Test case with pattern length == 1
          System.out.println("Smallest window containing all characters of '" + pat + "' is: " + pickSubstring(str, pat)); // Output: b
    }
}
