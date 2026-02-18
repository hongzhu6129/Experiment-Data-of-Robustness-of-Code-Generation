public class CubeChecker {

    public static void main(String[] args) {
        // Input handling (replace with your preferred method, e.g., Scanner)
        int num = 8; // Example input, replace with user input
        if (args.length > 0) {  // Read input from command line arguments
            try {
                num = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
                return; // Exit if input is not a valid integer
            }
        }


        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int num) {
        if (num < 0) {  // Handle negative numbers (cubes can be negative)
            return isCube(-num); 
        } else if (num == 0) { // Handle zero explicitly
            return true;
        } else {
            int cbrt = (int) Math.round(Math.cbrt(num)); // Calculate cube root
            return cbrt * cbrt * cbrt == num;         // Check if cube root cubed equals original number
        }

    }
}
