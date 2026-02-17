public class CubeChecker {

    public static void main(String[] args) {
        // For simplicity, we'll hardcode the input for this example, 
        // as the prompt specifies taking input within main.
        int num = 8; 

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        // Test with a few more values:
        testCube(27);
        testCube(1000);
        testCube(100);
        testCube(-8); // Handle negative numbers
        testCube(0);   // Handle zero
    }


    private static boolean isCube(int num) {
        // Handle negative numbers:
        if (num < 0) {
            return isCube(-num); // Check if the absolute value is a cube
        }

         // Handle zero:
        if (num == 0) {
            return true;
        }
        
        // Binary search for the cube root
        int low = 1;
        int high = num;

        while (low <= high) {
            int mid = low + (high - low) / 2;  // Avoid potential overflow
            int cube = mid * mid * mid;

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



    // Helper function to test and print the results neatly
    private static void testCube(int num) {
         if (isCube(num)) {
            System.out.println(num + " is a cube.");
        } else {
            System.out.println(num + " is not a cube.");
        }
    }
}
