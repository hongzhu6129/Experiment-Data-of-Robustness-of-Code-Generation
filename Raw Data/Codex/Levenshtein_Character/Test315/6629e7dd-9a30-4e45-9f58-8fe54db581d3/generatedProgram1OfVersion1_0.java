public class RemoveLetters {

    public static void main(String[] args) {
        String inputString = "apple pie and quince jam with rhubarb";
        String updatedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Updated string: " + updatedString);

        inputString = "programming";
        updatedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Updated string: " + updatedString);


        inputString = "No pqr here"; // Test case with no p, q, or r
        updatedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Updated string: " + updatedString);
    }

    public static String validate(String inputString) {
        // Using StringBuilder for efficient string manipulation
        StringBuilder updatedString = new StringBuilder(); 
        for (char c : inputString.toCharArray()) {
            if (c != 'p' && c != 'q' && c != 'r') {
                updatedString.append(c);
            }
        }
        return updatedString.toString();
    }
}
