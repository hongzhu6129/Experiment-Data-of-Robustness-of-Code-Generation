public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "Hello World";
        char fictionalChar = '*';

        String modifiedString = validate(inputString, fictionalChar);
        System.out.println(modifiedString); // Output: H*ll* W*rld


        inputString = "AEIOUaeiou";
        fictionalChar = '$';
        modifiedString = validate(inputString, fictionalChar);
        System.out.println(modifiedString); // Output: $$$$$$$$$
    }


    public static String validate(String inputString, char fictionalChar) {
        if (inputString == null) {
            return null;  // Or throw an exception, depending on your requirements
        }

        StringBuilder result = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (isVowel(c)) {
                result.append(fictionalChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
