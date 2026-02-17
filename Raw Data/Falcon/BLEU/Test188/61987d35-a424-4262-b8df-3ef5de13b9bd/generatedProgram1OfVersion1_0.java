public class ReplaceVowels {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char replacementChar = '*';

        String modifiedString = validate(inputString, replacementChar);

        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + modifiedString);


        inputString = "This is another example.";
        replacementChar = '+';

        modifiedString = validate(inputString, replacementChar);

        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + modifiedString);


        inputString = "AEIOUaeiou"; //All vowels
        replacementChar = '-';


        modifiedString = validate(inputString, replacementChar);
        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + modifiedString);

        //Test with empty string
        inputString = "";
        replacementChar = '!';
        modifiedString = validate(inputString, replacementChar);
        System.out.println("Original string: " + inputString);
        System.out.println("Modified string: " + modifiedString);



    }

    public static String validate(String inputString, char replacementChar) {
        if (inputString == null) {
            return null; // Or handle null input as needed
        }

        StringBuilder result = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (isVowel(c)) {
                result.append(replacementChar);
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
