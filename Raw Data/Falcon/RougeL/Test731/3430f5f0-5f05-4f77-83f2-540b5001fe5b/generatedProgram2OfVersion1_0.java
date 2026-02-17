public class Main {
    public static void main(String[] args) {
        String input = "3.0";

        try {
            double doubleValue = Double.parseDouble(input);
            System.out.println("python tutorial " + doubleValue); // Now works correctly with floating-point values.
        } catch (NumberFormatException e) {
            System.out.println("Could not parse as a number: " + input);  // Handle potential parsing errors
        }
    }
}
