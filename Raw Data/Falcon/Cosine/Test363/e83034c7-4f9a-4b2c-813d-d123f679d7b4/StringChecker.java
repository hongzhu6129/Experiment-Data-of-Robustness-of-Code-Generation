public class StringChecker {

    public static void main(String[] args) {
        System.out.println(test("programming", "program")); // true
        System.out.println(test("hello", "world")); // false
        System.out.println(test("aabbcc", "abc")); // true
        System.out.println(test("aabbc", "abbc")); //true
        System.out.println(test("aabbc", "abcc")); // false -  extra 'c'
        System.out.println(test("Silent", "Listen"));  //false - case-sensitive
        System.out.println(test("Listen", "Silent"));  //false - case-sensitive

    }

    public static boolean test(String str1, String str2) {
        // Convert strings to character arrays for easier manipulation
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Check if each character in str2 exists in str1
        for (char c2 : charArray2) {
            boolean found = false;
            for (char c1 : charArray1) {
                if (c1 == c2) {
                    found = true;
                    break; // Character found, move to the next character in str2
                }
            }
            if (!found) {
                return false; // Character from str2 not found in str1
            }
        }

        return true; // All characters from str2 are present in str1
    }
}
