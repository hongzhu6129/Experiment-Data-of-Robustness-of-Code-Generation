public class ConsecutiveIdenticalLetters {

    public static void main(String[] args) {
        String str1 = "aabbccd";
        System.out.println(str1 + ": " + test(str1)); // Output: true

        String str2 = "abcded";
        System.out.println(str2 + ": " + test(str2)); // Output: false

        String str3 = "aabbcceea";
        System.out.println(str3 + ": " + test(str3)); // Output: true


        String str4 = ""; // Empty string
        System.out.println(str4 + ": " + test(str4)); // Output: false

        String str5 = "a"; // Single character string
        System.out.println(str5 + ": " + test(str5)); // Output: false
    }

    public static boolean test(String str) {
        if (str == null || str.length() < 2) {
            return false; 
        }

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}
