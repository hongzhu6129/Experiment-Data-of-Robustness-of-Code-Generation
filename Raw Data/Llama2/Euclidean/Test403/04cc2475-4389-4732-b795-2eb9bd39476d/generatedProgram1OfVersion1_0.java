public class CubeChecker {

    public static void main(String[] args) {
        // Input data (replace with user input if needed)
        int number = 8; 

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int n) {
        if (n < 0) {  // Handle negative numbers efficiently
             return isCube(-n); //negate and check positive value
        }
		
        int root = (int) Math.round(Math.cbrt(n)); // Calculate the cube root and round to nearest int
        return (root * root * root == n); // Check if the cube of the root is equal to the original number
    }
}
