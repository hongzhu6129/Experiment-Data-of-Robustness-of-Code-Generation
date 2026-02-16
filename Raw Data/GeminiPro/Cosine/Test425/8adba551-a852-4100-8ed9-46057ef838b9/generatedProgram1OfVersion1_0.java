public class ConsecutiveLetters {

    public static void main(String[] args) {
        String str1 = "aabbccd";
        String str2 = "abcded";
        String str3 = "Hooot";

        System.out.println(str1 + ": " + test(str1)); // true
        System.out.println(str2 + ": " + test(str2)); // false
        System.out.println(str3 + ": " + test(str3)); // true

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
