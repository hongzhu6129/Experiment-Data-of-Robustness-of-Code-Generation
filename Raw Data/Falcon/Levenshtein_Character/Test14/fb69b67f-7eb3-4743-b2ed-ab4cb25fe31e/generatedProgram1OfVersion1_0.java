public class RemoveVowels {

    public static void main(String[] args) {
        String inputString = "Hello World";
        String updatedString = validate(inputString);
        System.out.println(updatedString); // Output: Hll Wrld

        inputString = "AEIOUaeiou";
        updatedString = validate(inputString);
        System.out.println(updatedString); // Output: 

        inputString = "This is a test string.";
        updatedString = validate(inputString);
        System.out.println(updatedString); // Output: Ths s  tst strng.


    }

    public static String validate(String inputString) {
        if (inputString == null) {
            return null; // Or handle null input as needed
        }

        StringBuilder sb = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (!isVowel(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }


    private static boolean isVowel(char c) {
        // Convert to lowercase for case-insensitive check
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}



