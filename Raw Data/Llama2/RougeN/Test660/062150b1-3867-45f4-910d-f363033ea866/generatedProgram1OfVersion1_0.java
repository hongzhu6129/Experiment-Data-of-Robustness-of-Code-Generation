public class ReverseWords {

    public static String WordsInReverse(String str) {
        if (str == null || str.trim().isEmpty()) {
            return ""; // Handle null or empty input
        }

        String[] words = str.trim().split("\\s+"); // Split by whitespace
        StringBuilder reversedString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i > 0) {
                reversedString.append(" ");
            }
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        String inputString1 = "the sky is blue";
        String reversedString1 = WordsInReverse(inputString1);
        System.out.println("Reversed string 1: \"" + reversedString1 +"\""); // Output: "blue is sky the"


        String inputString2 = "  hello world  ";  // Test with leading/trailing spaces
        String reversedString2 = WordsInReverse(inputString2);
        System.out.println("Reversed string 2: \"" + reversedString2 +"\""); // Output: "world hello"

        String inputString3 = null;  // Test null input.
        String reversedString3 = WordsInReverse(inputString3);
        System.out.println("Reversed string 3: \"" + reversedString3 +"\""); // Output ""

        String inputString4 = " "; // Test with only spaces
        String reversedString4 = WordsInReverse(inputString4);
        System.out.println("Reversed string 4: \"" + reversedString4 +"\""); // Output ""


         String inputString5 = "a"; // Test with single word
        String reversedString5 = WordsInReverse(inputString5);
        System.out.println("Reversed string 5: \"" + reversedString5 +"\""); // Output "a"

    }
}
