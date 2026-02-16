public class StringArray {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the array size as a command-line argument.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);

            if (n <= 0) {
                System.out.println("Array size must be greater than 0.");
                return;
            }

            String[] stringArray = new String[n];

            for (int i = 0; i < n; i++) {
                stringArray[i] = String.valueOf(i); // Convert integer i to a string
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


        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide an integer as a command-line argument.");
        }
    }
}
