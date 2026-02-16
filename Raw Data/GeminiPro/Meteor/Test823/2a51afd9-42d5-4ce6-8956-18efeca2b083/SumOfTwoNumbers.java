public class SumOfTwoNumbers {

    public static void main(String[] args) {
        // Test data: 74 + 36 = 110

        int num1 = 74;
        int num2 = 36;
        int sum = num1 + num2;

        System.out.println(sum); // Output: 110


        // Handling string input with potential non-numeric characters
        // (Based on the "74 h 36: 110" test data format)

        String input = "74 h 36"; // Example input

        try {
            String[] parts = input.split("\\D+"); // Split by non-digit characters
            if (parts.length >= 2) {
                int n1 = Integer.parseInt(parts[0]);
                int n2 = Integer.parseInt(parts[1]);
                int s = n1 + n2;
                System.out.println(s); // Output: 110 (for the "74 h 36" input)
            } else {
                System.out.println("Invalid input format.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input format."); 
        }


    }
}
