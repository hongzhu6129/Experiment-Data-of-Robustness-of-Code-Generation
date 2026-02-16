public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example, could be taken from user input)
        int number = 8;

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Test other cases
        number = 27;  // Cube of 3
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        number = 10; // Not a perfect cube
         if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        number = 0;  // Cube of 0
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        number = -8; //Cube of -2
        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


    }

    private static boolean isCube(int num) {
        // Handle negative numbers (cube root of a negative number is negative)
        if (num < 0) {
             return isCube(-num);  //Check if absolute value is cube
        }

         //Binary Search method (efficient for larger numbers)
        long low = 0;
        long high = num;

        while (low <= high) {
            long mid = low + (high - low) / 2;  // Prevent potential overflow
            long cube = mid * mid * mid;

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
