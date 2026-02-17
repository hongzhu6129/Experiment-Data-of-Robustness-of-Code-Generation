import java.util.HashMap;
import java.util.Map;

public class StringAppearanceChecker {

    public boolean checkSameAppearance(String str) {
        if (str == null || str.length() < 3) {
            return false; // Not enough characters for substrings of length 3
        }

        Map<String, Integer> substringCounts = new HashMap<>();

        for (int i = 0; i <= str.length() - 3; i++) {
            String substring = str.substring(i, i + 3);
            substringCounts.put(substring, substringCounts.getOrDefault(substring, 0) + 1);
        }


        int count3 = 0;
        int count4 = 0;
        for (char c : str.toCharArray()) {
            if (c == '3') {
                count3++;
            } else if (c == '4') {
                count4++;
            }
        }
         return count3 == count4;
    }

    public static void main(String[] args) {
        StringAppearanceChecker checker = new StringAppearanceChecker();

        String str1 = "3434";
        System.out.println("String: " + str1 + ", Same Appearance of 3 and 4 : " + checker.checkSameAppearance(str1));  // Output: true

        String str2 = "334443";
        System.out.println("String: " + str2 + ", Same Appearance of 3 and 4: " + checker.checkSameAppearance(str2));  // Output: false


        String str3 = "3334444";
        System.out.println("String: " + str3 + ", Same Appearance of 3 and 4: " + checker.checkSameAppearance(str3));  // Output: false


        String str4 = ""; // Empty string
        System.out.println("String: " + str4 + ", Same Appearance of 3 and 4: " + checker.checkSameAppearance(str4));  // Output: false

        String str5 = "12"; // String less than length 3
        System.out.println("String: " + str5 + ", Same Appearance of 3 and 4: " + checker.checkSameAppearance(str5));  // Output: false


        String str6 = "312444343";
        System.out.println("String: " + str6 + ", Same Appearance of 3 and 4: " + checker.checkSameAppearance(str6));  // Output: true



    }
}
