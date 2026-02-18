public class StartsWithNumber {

    public static void main(String[] args) {
        String input1 = "123abc";
        String input2 = "abc123";
        String input3 = "1abc123";
        String input4 = " 123abc"; // Note the leading space

        System.out.println("\"" + input1 + "\" starts with a number: " + validate(input1));
        System.out.println("\"" + input2 + "\" starts with a number: " + validate(input2));
        System.out.println("\"" + input3 + "\" starts with a number: " + validate(input3));
        System.out.println("\"" + input4 + "\" starts with a number: " + validate(input4));


    }

    public static String validate(String input) {
        if (input == null || input.isEmpty()) {
            return "false"; // Handle null or empty input
        }

        char firstChar = input.charAt(0);
        return Character.isDigit(firstChar) ? "true" : "false"; // Use Character.isDigit for clarity
    }
}
