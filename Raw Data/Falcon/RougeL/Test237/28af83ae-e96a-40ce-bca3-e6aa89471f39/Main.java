public class Main {
    public static void main(String[] args) {
        try {
            // This line will cause a NumberFormatException because "quick" cannot be parsed as an integer.
            int num = Integer.parseInt("quick"); 

            // This line will not be reached if the exception is thrown.
            System.out.println("The integer is: " + num); 

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input.  \"quick\" cannot be converted to an integer.");
            // Here you can handle the exception appropriately. For example,
            // you might ask the user to re-enter the input, or you might
            // use a default value instead.
        }

        // Example demonstrating correct usage:
        try {
            int num = Integer.parseInt("123");
            System.out.println("The integer is: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input.");
        }


        // Another example demonstrating how to check if a string is a number before parsing:
        String inputString = "quick";  // or "1234"

        if (inputString.matches("-?\\d+")) { // Matches optional negative sign, followed by one or more digits
            int num = Integer.parseInt(inputString);
            System.out.println("The integer is: " + num);
        } else {
            System.out.println("Error: Invalid input. \"" + inputString + "\" is not a valid integer.");
        }
    }
}
