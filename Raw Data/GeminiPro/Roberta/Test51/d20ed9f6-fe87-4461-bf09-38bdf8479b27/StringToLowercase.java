public class StringToLowercase {

    public static void main(String[] args) {

        // Test cases
        String test1 = "Hello World";
        String test2 = "UPPERCASE";
        String test3 = "lowercase";
        String test4 = "MiXeD cAsE";
        String test5 = ""; // Empty string
        String test6 = "12345"; // Numbers and symbols
        String test7 = "  Spaces  "; // Leading and trailing spaces
        String test8 = null; // Null string (handle carefully)


        System.out.println("Original: \"" + test1 + "\" Lowercase: \"" + toLowercase(test1) + "\"");
        System.out.println("Original: \"" + test2 + "\" Lowercase: \"" + toLowercase(test2) + "\"");
        System.out.println("Original: \"" + test3 + "\" Lowercase: \"" + toLowercase(test3) + "\"");
        System.out.println("Original: \"" + test4 + "\" Lowercase: \"" + toLowercase(test4) + "\"");
        System.out.println("Original: \"" + test5 + "\" Lowercase: \"" + toLowercase(test5) + "\"");
        System.out.println("Original: \"" + test6 + "\" Lowercase: \"" + toLowercase(test6) + "\"");
        System.out.println("Original: \"" + test7 + "\" Lowercase: \"" + toLowercase(test7) + "\"");


       try { // Handle NullPointerException using try-catch
            System.out.println("Original: \"" + test8 + "\" Lowercase: \"" + toLowercase(test8) + "\"");
        } catch (NullPointerException e) {
            System.out.println("Original: null Lowercase: null "); // Or other appropriate handling
        }
    }



    // Function to convert to lowercase without using built-in methods 
    public static String toLowercase(String str) {
        if (str == null) {
            return null; // Handle null input
        }

        char[] charArray = str.toCharArray();
        StringBuilder lowercaseStr = new StringBuilder();

        for (char c : charArray) {
            if (c >= 'A' && c <= 'Z') {
                lowercaseStr.append((char) (c + 32)); // Convert to lowercase
            } else {
                lowercaseStr.append(c);
            }
        }

        return lowercaseStr.toString();
    }
}
