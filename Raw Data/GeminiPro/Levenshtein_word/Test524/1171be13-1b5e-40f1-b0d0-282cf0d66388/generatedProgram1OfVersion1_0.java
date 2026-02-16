public class CubeChecker {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one integer argument.");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);

            if (isCube(num)) {
                System.out.println("number is a cube.");
            } else {
                System.out.println("number is not a cube.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }


    private static boolean isCube(int num) {
        // Handle negative numbers.  The cube root of a negative number is negative.
        if (num < 0) {
            return isCube(-num); // Check the absolute value for simplicity
        }

         // Binary search for cube root.  More efficient than brute force
        int low = 0;
        int high = num; 

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid potential overflow
            long cube = (long)mid * mid * mid; // Use long to handle large cubes

            if (cube == num) {
                return true;
            } else if (cube < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}
