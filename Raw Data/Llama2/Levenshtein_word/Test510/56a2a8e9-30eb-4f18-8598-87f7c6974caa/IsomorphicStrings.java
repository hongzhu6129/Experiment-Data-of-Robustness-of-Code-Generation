import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {
        String str1 = "egg";
        String str2 = "add";
        System.out.println(is_Isomorphic(str1, str2)); // Output: true

        str1 = "foo";
        str2 = "bar";
        System.out.println(is_Isomorphic(str1, str2)); // Output: false

        str1 = "paper";
        str2 = "title";
        System.out.println(is_Isomorphic(str1, str2)); // Output: true


        str1 = "badc";
        str2 = "baba";
        System.out.println(is_Isomorphic(str1, str2)); // Output: false

         str1 = "";
        str2 = "";
        System.out.println(is_Isomorphic(str1, str2)); // Output: true



    }

    public static boolean is_Isomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> reverseMap = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            if (map.containsKey(char1)) {
                if (map.get(char1) != char2) {
                    return false;
                }
            } else if (reverseMap.containsKey(char2)) {  // Check if char2 is already mapped to something else
                return false;
            } else {
                map.put(char1, char2);
                reverseMap.put(char2, char1);
            }
        }

        return true;
    }
}
