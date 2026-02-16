public class VowelChecker {

    public static void main(String[] args) {
        String str1 = "aeiou";
        String str2 = "aeiouAEIOU";
        String str3 = "hello";
        String str4 = "rhythm";
        String str5 = "";


        System.out.println(str1 + ": " + test(str1)); // true
        System.out.println(str2 + ": " + test(str2)); // true
        System.out.println(str3 + ": " + test(str3)); // false
        System.out.println(str4 + ": " + test(str4)); // false
        System.out.println(str5 + ": " + test(str5)); // true (empty string considered all vowels)
    }

    public static boolean test(String str) {
        if (str == null || str.length() == 0) { 
            return true; // Empty or null string is considered all vowels
        }

        str = str.toLowerCase(); // Handle both uppercase and lowercase vowels

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                return false;
            }
        }

        return true;
    }
}
