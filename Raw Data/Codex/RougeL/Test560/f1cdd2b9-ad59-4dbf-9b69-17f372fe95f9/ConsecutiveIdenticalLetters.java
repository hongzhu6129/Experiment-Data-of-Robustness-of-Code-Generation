public class ConsecutiveIdenticalLetters {

    public static void main(String[] args) {
        String str1 = "aabbccd";
        System.out.println("String: " + str1);
        System.out.println("Has consecutive identical letters: " + test(str1));

        String str2 = "abcded";
        System.out.println("\nString: " + str2);
        System.out.println("Has consecutive identical letters: " + test(str2));


        String str3 = "AabBcC"; // Case-sensitive
        System.out.println("\nString: " + str3);
        System.out.println("Has consecutive identical letters: " + test(str3));
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
