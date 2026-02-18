public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string @contains #special %characters!";
        String validatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Validated String: " + validatedString);


        inputString = "Another123Test";
        validatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Validated String: " + validatedString);


        inputString = "";
        validatedString = validate(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Validated String: " + validatedString);
    }

    public static String validate(String input) {
        if (input == null) {
            return null; // Or handle null as needed, e.g., return "";
        }
        return input.replaceAll("[^a-zA-Z0-9]", ""); 
    }
}
