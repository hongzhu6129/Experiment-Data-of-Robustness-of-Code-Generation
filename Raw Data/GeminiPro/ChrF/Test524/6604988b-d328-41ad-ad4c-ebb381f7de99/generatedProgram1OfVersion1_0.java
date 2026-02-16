public class CubeChecker {

    public static void main(String[] args) {
        // Input: Read a number from the command line arguments.
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);

            // Check if the number is a cube.
            if (isCube(number)) {
                System.out.println("Number is a cube.");
            } else {
                System.out.println("Number is not a cube.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }


    private static boolean isCube(int number) {
        // Handle negative numbers (cube root of a negative number is negative)
        int absNumber = Math.abs(number);

        // Binary search approach for efficiency
        int low = 1, high = absNumber; 
        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid potential integer overflow
            int cube = mid * mid * mid;

            if (cube == absNumber) {
                return true; 
            } else if (cube < absNumber) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
