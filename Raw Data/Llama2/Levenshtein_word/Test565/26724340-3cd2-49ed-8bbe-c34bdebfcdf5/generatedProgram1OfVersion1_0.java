public class CubeChecker {

    public static void main(String[] args) {
        // Input data (replace with user input if needed)
        int num = 8; 

        // Check if the number is a cube
        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        // Test with other values
        testCube(27);  // Cube
        testCube(30);  // Not a cube
        testCube(-8); // Cube (of -2)
        testCube(0); // Cube (of 0)
        testCube(1); // Cube (of 1)
        testCube(1000); // Cube of 10

        // Handle user input from command line arguments
        if(args.length > 0) {
            try {
                int userNum = Integer.parseInt(args[0]);
                testCube(userNum);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

    }

    private static boolean isCube(int num) {
        // Efficiently handle cubes of negative numbers
        int absNum = Math.abs(num);

        // Binary search for the cube root (efficient for large numbers)
        int low = 0;
        int high = absNum;  // Highest possible cube root is less than the number itself

        while(low <= high) {
             int mid = low + (high - low)/2;
             int cube = mid * mid * mid;
             if(cube == absNum) {

                // Check the original sign of the number.
                if(num < 0) {
                    return mid * mid * mid * -1 == num; // Negative numbers
                }

                return true;
             }
             else if(cube < absNum) {
                 low = mid + 1;
             }
             else{
                 high = mid - 1;
             }
         }
         return false;
    }




    private static void testCube(int num) {
        if (isCube(num)) {
            System.out.println(num + " is a cube.");
        } else {
            System.out.println(num + " is not a cube.");
        }
    }
}
