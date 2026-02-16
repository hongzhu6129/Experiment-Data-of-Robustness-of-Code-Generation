public class RemoveLetters {

    public static void main(String[] args) {
        String inputString = "apple, banana, pear, orange, grapefruit, raspberry";
        String updatedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Updated string: " + updatedString);


        inputString = "programming";
        updatedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Updated string: " + updatedString);

        inputString = ""; // Empty String
        updatedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Updated string: " + updatedString);


        inputString = null; // Null String -  Handle potential NullPointerException
        updatedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Updated string: " + updatedString);


    }

    public static String validate(String inputString) {
        if (inputString == null) {
            return null; // Or return ""; depending on how you want to handle null input
        }

        // Using StringBuilder for efficient string manipulation
        StringBuilder sb = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (c != 'p' && c != 'q' && c != 'r') {
                sb.append(c);
            }
        }
        return sb.toString();


        // Alternatively, using replaceAll with regular expression:
        //return inputString.replaceAll("[pqr]", ""); 

    }
}
