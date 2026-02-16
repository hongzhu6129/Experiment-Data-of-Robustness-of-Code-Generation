public class RemoveVowels {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        String result = validate(inputString);
        System.out.println(result); // Output: Hll, Wrld!

        inputString = "AEIOUaeiou";
        result = validate(inputString);
        System.out.println(result); // Output: 

        inputString = "This is a test string.";
        result = validate(inputString);
        System.out.println(result); // Output: Ths s  tst strng.



    }

    public static String validate(String input) {
        if (input == null) {
            return null; // Or handle null input as needed
        }

        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (!isVowel(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Case-insensitive check
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
