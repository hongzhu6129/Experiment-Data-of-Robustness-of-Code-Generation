public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string contains 123 numbers and !@#$ symbols.";
        String validatedString = validate(inputString);
        System.out.println(validatedString); 
    }

    public static String validate(String str) {
        if (str == null) {
            return null; // Handle null input
        }
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }
}
