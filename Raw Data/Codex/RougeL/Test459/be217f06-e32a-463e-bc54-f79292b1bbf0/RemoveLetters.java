public class RemoveLetters {

    public static void main(String[] args) {
        String inputString = "apple, banana, orange, grapefruit, pear, raspberry, quince";
        String updatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Updated String: " + updatedString);


        inputString = "programming";
        updatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Updated String: " + updatedString);

         inputString = ""; // Test with empty string
        updatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Updated String: " + updatedString);

          inputString = null; // Test with null string
        updatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Updated String: " + updatedString);


    }

    public static String validate(String inputString) {
        if (inputString == null) {
            return null; // Or handle null as needed, e.g., return an empty string
        }

        return inputString.replaceAll("[pqr]", ""); 

    }
}
