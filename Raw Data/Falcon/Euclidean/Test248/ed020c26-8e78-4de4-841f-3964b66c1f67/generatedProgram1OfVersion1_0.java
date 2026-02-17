public class StringArray {

    public static void main(String[] args) {
        int n = 10; // Example: Create an array of length 10 (change as needed)

        if (n <= 0) {
            System.out.println("Array length must be greater than 0.");
            return; // Exit if n is invalid
        }

        String[] stringArray = new String[n];

        for (int i = 0; i < n; i++) {
            stringArray[i] = String.valueOf(i); // Convert integer to string
        }

        // Print the array (optional)
        System.out.print("Created array: [");
        for (int i = 0; i < n; i++) {
            System.out.print(stringArray[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
