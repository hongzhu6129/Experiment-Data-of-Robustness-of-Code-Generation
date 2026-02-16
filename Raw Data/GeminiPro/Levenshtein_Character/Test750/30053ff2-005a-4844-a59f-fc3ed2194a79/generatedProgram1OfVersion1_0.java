public class VowelSuccessor {

    public static void main(String[] args) {
        String inputString = "Hello World";
        char replacementChar = '*';

        String result = validate(inputString, replacementChar);
        System.out.println(result); // Output: H*ll* W*rld

        inputString = "aeiouAEIOU";
        replacementChar = '+';
        result = validate(inputString, replacementChar);
        System.out.println(result); // Output: ++++++++++


        inputString = "This is a test string.";
        replacementChar = '$';
        result = validate(inputString, replacementChar);
        System.out.println(result); // Output: Th$s $s $ t$st str$ng.


    }

    public static String validate(String inputString, char replacementChar) {
        if (inputString == null) {
            return null; // Or handle null input as needed
        }

        StringBuilder sb = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (isVowel(c)) {
                sb.append(replacementChar);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}

