public class RemoveLetters {

    public static void main(String[] args) {
        String inputString = "apple, banana, cherry, pear, quince, raspberry";
        String updatedString = validate(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Updated string: " + updatedString);


        // More test cases
        System.out.println(validate("programming")); // Output: ogamming
        System.out.println(validate("quiet")); // Output: uiet
        System.out.println(validate("road")); // Output: oad
        System.out.println(validate("zebra")); // Output: zebra (no change)
        System.out.println(validate("")); // Output:  (empty string) 
    }

    public static String validate(String input) {
        if (input == null) {
            return null; // Or handle null as needed (e.g., return "")
        }
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c != 'p' && c != 'q' && c != 'r') {
                sb.append(c);
            }
        }
        return sb.toString();

    }
}
