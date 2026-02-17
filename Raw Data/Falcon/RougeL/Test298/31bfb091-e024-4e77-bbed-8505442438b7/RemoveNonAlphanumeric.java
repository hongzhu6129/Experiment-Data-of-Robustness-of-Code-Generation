public class RemoveNonAlphanumeric {

    public static void main(String[] args) {
        String inputString = "This string contains #$%^&*()_+=-`~[]\\;',./{}|:\"<>? and 1234567890.";
        String validatedString = validate(inputString);
        System.out.println(validatedString); 
    }

    public static String validate(String str) {
        if (str == null) {
            return null;  // Handle null input
        }
        return str.replaceAll("[^a-zA-Z0-9]", ""); 
    }
}
