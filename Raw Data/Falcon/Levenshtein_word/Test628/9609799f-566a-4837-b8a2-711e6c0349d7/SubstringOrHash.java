public class SubstringOrHash {

    public static String getFirstThreeChars(String str) {
        if (str == null) {
            return "###"; // Handle null input
        }

        int len = str.length();
        if (len >= 3) {
            return str.substring(0, 3);
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                if (i < len) {
                    result.append(str.charAt(i));
                } else {
                    result.append("#");
                }
            }
            return result.toString();
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(getFirstThreeChars("abcdef"));   // Output: abc
        System.out.println(getFirstThreeChars("ab"));      // Output: ab#
        System.out.println(getFirstThreeChars("a"));       // Output: a##
        System.out.println(getFirstThreeChars(""));        // Output: ###
        System.out.println(getFirstThreeChars(null));     // Output: ### (Handles null input)
        System.out.println(getFirstThreeChars("12345"));  // Output: 123
        System.out.println(getFirstThreeChars("12"));     // Output: 12#
        System.out.println(getFirstThreeChars(" "));     // Output:  ## (Handles spaces)



    }
}
