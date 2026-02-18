public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example, could be read from user input)
        int num = 8; 

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int num) {
        if (num < 0) {  // Handle negative numbers (cube root is also negative)
            return isCube(-num);
        }

        // Binary search for the cube root
        long low = 0;
        long high = num; 

        while (low <= high) {
            long mid = low + (high - low) / 2;  // Avoid potential overflow
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
