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


        inputString = ""; // Empty String
        updatedString = validate(inputString);
        System.out.println(updatedString); // Output:


        inputString = null; // Null String  (important to handle this!)
        updatedString = validate(inputString);
        System.out.println(updatedString); // Output: null


    }

    public static String validate(String inputString) {
        if (inputString == null) {  // Handle null input
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            // Check if the character is NOT a vowel (case-insensitive)
            if (!"AEIOUaeiou".contains(String.valueOf(c))) { 
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
