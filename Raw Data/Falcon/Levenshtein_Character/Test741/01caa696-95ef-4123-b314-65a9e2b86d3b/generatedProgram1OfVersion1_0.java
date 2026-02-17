public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example based on the prompt)
        int num = 8; 

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

         // Example with user input (requires exception handling)
         /* 
         Scanner scanner = new Scanner(System.in);
         System.out.print("Input a number: ");
         try {
             int num = scanner.nextInt();
             if (isCube(num)) {
                 System.out.println("Number is a cube.");
             } else {
                 System.out.println("Number is not a cube.");
             }
         } catch (InputMismatchException e) {
             System.out.println("Invalid input. Please enter an integer.");
         } finally {
             scanner.close(); // Important to close the scanner
         }
         */
    }



    private static boolean isCube(int num) {
        // Handle negative numbers
        if (num < 0) {
            return isCube(-num); // Check the cube of the absolute value for negative inputs
        }


        // Efficient check (better than brute force)
        int root = Math.round(Math.cbrt(num)); // Calculate the cube root and round to the nearest integer
        return root * root * root == num;      // Check if the cube of the root equals the original number
    }
}
