public class StringArray {

    public static void main(String[] args) {
        int n = 10; // Change this value for a different array length

        if (n <= 0) {
            System.out.println("Array length must be greater than 0.");
            return; // Exit if n is invalid
        }

        String[] stringArray = new String[n];

        for (int i = 0; i < n; i++) {
            stringArray[i] = String.valueOf(i); // Convert integer to string
        }

        // Print the array elements (optional)
        System.out.print("Array elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(stringArray[i] + " ");
        }
        System.out.println(); // Newline for cleaner output
    }
}
