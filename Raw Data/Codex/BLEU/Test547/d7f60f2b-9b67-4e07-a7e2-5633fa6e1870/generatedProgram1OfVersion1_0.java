public class CubeChecker {

    public static void main(String[] args) {
        // Input data (you can modify this to take user input)
        int num = 8; 

        if (isCube(num)) {
            System.out.println("number is a cube.");
        } else {
            System.out.println("number is not a cube.");
        }
    }

    private static boolean isCube(int num) {
        // Handle negative numbers (their cube roots are also negative)
        if (num < 0) {
           return isCube(-num); // Check the absolute value and return the result
        }

        //Efficiently find the cube root by iterating up to the cubic root's potential maximum
        for (int i = 0; i <= num; i++) {  // Iterate only up to the cube root's maximum possible value
            if (i * i * i == num) {
                return true;
            } else if (i * i * i > num) { // Optimization: If the cube exceeds num, no need to check further
                return false;
            }
        }
        return false; 
    }
}
