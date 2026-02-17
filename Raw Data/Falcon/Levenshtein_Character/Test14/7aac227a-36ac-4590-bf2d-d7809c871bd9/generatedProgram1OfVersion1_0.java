public class RemoveVowels {

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        String updatedString = validate(inputString);
        System.out.println(updatedString); // Output: Hll, Wrld!

        inputString = "AEIOUaeiou";
        updatedString = validate(inputString);
        System.out.println(updatedString); // Output: 

        inputString = "This is a test.";
        updatedString = validate(inputString);
        System.out.println(updatedString);  // Output: Ths s  tst.
    }

    public static String validate(String str) {
        if (str == null) {
            return null; // Or handle null input as needed
        }

        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            // Convert to lowercase for case-insensitive check
            char lowerC = Character.toLowerCase(c);
            if (lowerC != 'a' && lowerC != 'e' && lowerC != 'i' && lowerC != 'o' && lowerC != 'u') {
                sb.append(c);
            }
        }
        return sb.toString();


    }
}
