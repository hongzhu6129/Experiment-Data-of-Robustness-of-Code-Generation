public class StringArrayGenerator {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an array length as a command-line argument.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);

            if (n <= 0) {
                System.out.println("Array length must be greater than 0.");
                return;
            }

            String[] stringArray = new String[n];
            for (int i = 0; i < n; i++) {
                stringArray[i] = String.valueOf(i); // Convert integer to string
            }

            // Print the array (optional)
            System.out.print("[");
            for (int i = 0; i < n; i++) {
                System.out.print(stringArray[i]);
                if (i < n - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");


        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide an integer for the array length.");
        }


    }
}
