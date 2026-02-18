public class ConsecutiveIdenticalLetters {

    public static void main(String[] args) {
        String str1 = "aabbccd";
        System.out.println("String: " + str1);
        System.out.println("Contains consecutive identical letters: " + test(str1));

        String str2 = "abcdefgh";
        System.out.println("\nString: " + str2);
        System.out.println("Contains consecutive identical letters: " + test(str2));

        String str3 = "abbcdeff";
        System.out.println("\nString: " + str3);
        System.out.println("Contains consecutive identical letters: " + test(str3));

        String str4 = ""; // Empty string
        System.out.println("\nString: " + str4);
        System.out.println("Contains consecutive identical letters: " + test(str4));


        String str5 = "a"; // Single character string
        System.out.println("\nString: " + str5);
        System.out.println("Contains consecutive identical letters: " + test(str5));
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
