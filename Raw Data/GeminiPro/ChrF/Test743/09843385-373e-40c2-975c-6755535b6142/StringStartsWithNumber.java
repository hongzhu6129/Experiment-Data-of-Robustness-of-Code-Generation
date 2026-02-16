public class StringStartsWithNumber {

    public static void main(String[] args) {
        String input1 = "123abc";
        String input2 = "abc123";
        String input3 = "1abc123";

        System.out.println(input1 + ": " + validate(input1)); // Output: 123abc: true
        System.out.println(input2 + ": " + validate(input2)); // Output: abc123: false
        System.out.println(input3 + ": " + validate(input3)); // Output: 1abc123: true


        String specificNumber = "42"; // Example specific number
        String input4 = "42xyz";
        String input5 = "421xyz"; // Starts with 42, but also more
        String input6 = "abc42";


        System.out.println(input4 + " starts with " + specificNumber + ": " + validateWithSpecificNumber(input4,specificNumber)); // Output: 42xyz starts with 42: true
        System.out.println(input5 + " starts with " + specificNumber + ": " + validateWithSpecificNumber(input5,specificNumber)); // Output: 421xyz starts with 42: true 
        System.out.println(input6 + " starts with " + specificNumber + ": " + validateWithSpecificNumber(input6, specificNumber)); // Output: abc42 starts with 42: false
    }

    public static String validate(String input) {
        if (input == null || input.isEmpty()) {
            return "false"; // Or handle empty/null as needed
        }

        return Character.isDigit(input.charAt(0)) ? "true" : "false";
    }




    public static String validateWithSpecificNumber(String input, String specificNumber) {
        if (input == null || input.isEmpty() || specificNumber == null || specificNumber.isEmpty()) {
            return "false";
        }

        return input.startsWith(specificNumber) ? "true" : "false";
    }
}
