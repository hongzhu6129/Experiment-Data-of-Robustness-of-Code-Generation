public class RemoveVowels {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        String result = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("String without vowels: " + result);


        inputString = "AEIOUaeiou"; // Test all vowels
        result = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("String without vowels: " + result);

        inputString = ""; // Test empty string
        result = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("String without vowels: " + result);


        inputString = "This is a test string."; // Test with mixed case and spaces
        result = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("String without vowels: " + result);


    }

    public static String validate(String inputString) {
        if (inputString == null) {
            return null; // Or handle null as needed
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            // Check if the character is a vowel (both uppercase and lowercase)
            if (!"AEIOUaeiou".contains(String.valueOf(c))) {
                result.append(c);
            }
        }

        return result.toString();
    }
}


