public class SumOfTwoNumbers {

    public static void main(String[] args) {
        // Test data provided as a string "74 h 36: 110"
        String testData = "74 h 36: 110";

        // Extract the numbers from the test data string.  We'll assume the numbers 
        // are always separated by " h ".
        String[] parts = testData.split(" h ");
        if (parts.length == 2) {
            try {
                int num1 = Integer.parseInt(parts[0]);
                // Extract the second number, handling the colon.
                String num2Str = parts[1].split(":")[0].trim();
                int num2 = Integer.parseInt(num2Str);

                int sum = num1 + num2;
                System.out.println(sum);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input format.  Please provide numbers separated by ' h '.");
            }

        } else {
            System.out.println("Invalid input format.  Please provide two numbers separated by ' h '.");

        }


        //  More generalized solution (if the input format is not fixed):
        //  This handles situations where the numbers are not necessarily separated by " h "
        //  and there might be other non-numeric characters.

        String input = "74 h 36: 110";  // or any other input
        String numbersOnly = input.replaceAll("[^0-9]", " ");
        String[] numberStrings = numbersOnly.split("\\s+");
        int sum2 = 0;
        for (String numStr : numberStrings) {
            if (!numStr.isEmpty()) { // Avoid empty strings from multiple spaces
                try {
                    sum2 += Integer.parseInt(numStr);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number found: " + numStr); // Handle errors gracefully
                }
            }
        }
        System.out.println("Sum (generalized): " + sum2);



    }
}
