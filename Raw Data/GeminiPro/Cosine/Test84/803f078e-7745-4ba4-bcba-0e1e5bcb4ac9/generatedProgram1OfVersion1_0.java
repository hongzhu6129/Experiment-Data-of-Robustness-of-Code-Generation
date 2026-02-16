public class StringArray {

    public static void main(String[] args) {

        int n = 10; // Example: Create an array with 10 elements (0 through 9)
        // You can change 'n' to any desired non-zero length

        if (n <= 0) {
            System.out.println("Array length must be greater than 0.");
            return; // Exit if n is invalid
        }


        String[] stringArray = new String[n];

        for (int i = 0; i < n; i++) {
            stringArray[i] = String.valueOf(i); // Convert each integer to its string representation
        }

        // Print the array elements to verify (optional)
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
