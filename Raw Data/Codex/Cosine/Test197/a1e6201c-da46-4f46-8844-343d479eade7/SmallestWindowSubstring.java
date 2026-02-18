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

        int count = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;

        HashMap<Character, Integer> strMap = new HashMap<>();

        for (int end = 0; end < str.length(); end++) {
            char c = str.charAt(end);
            if (patMap.containsKey(c)) {
                strMap.put(c, strMap.getOrDefault(c, 0) + 1);
                if (strMap.get(c) <= patMap.get(c)) {
                    count++;
                }
            }

            if (count == pat.length()) {
                while (!patMap.containsKey(str.charAt(start)) || strMap.get(str.charAt(start)) > patMap.get(str.charAt(start))) {
                    if (patMap.containsKey(str.charAt(start)) && strMap.get(str.charAt(start)) > patMap.get(str.charAt(start))) {
                        strMap.put(str.charAt(start), strMap.get(str.charAt(start)) - 1);
                    }
                    start++;
                }

                int windowLen = end - start + 1;
                if (windowLen < minLen) {
                    minLen = windowLen;
                    minStart = start;
                }
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return str.substring(minStart, minStart + minLen);
    }


    public static void main(String[] args) {
        String str = "ADOBECODEBANC";
        String pat = "ABC";
        System.out.println("Smallest window containing all characters: " + pickSubstring(str, pat)); // Output: BANC

        str = "this is a test string";
        pat = "tist";
        System.out.println("Smallest window containing all characters: " + pickSubstring(str, pat)); // Output: t stri

        str = "zoomlazapzo";
        pat = "oza";
        System.out.println("Smallest window containing all characters: " + pickSubstring(str, pat)); // Output: apzo
    }
}
