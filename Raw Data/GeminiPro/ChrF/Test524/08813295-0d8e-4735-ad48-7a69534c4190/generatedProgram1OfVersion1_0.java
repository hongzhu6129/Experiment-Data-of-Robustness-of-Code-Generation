public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example based on prompt)
        int number = 8;

        // Check if the number is a perfect cube
        if (isPerfectCube(number)) {
            System.out.println("Number same a cube."); // Matching the output in the problem description
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isPerfectCube(int num) {
        // Handle negative numbers (their cubes are negative)
        if (num < 0) {
            return isPerfectCube(-num); // Check the absolute value
        }

        // Efficiently check for perfect cube using cubic root
        int cubeRoot = (int) Math.round(Math.cbrt(num)); 
        return cubeRoot * cubeRoot * cubeRoot == num;

        /*  Alternative (less efficient for very large numbers):
        for (int i = 0; i <= num; i++) {  // Iterate from 0 to n (inclusive)
            if (i * i * i == num) {
                return true;
            }
            if(i*i*i > num){ //Optimization. Stop early if i^3 exceeds the number
                break;
            }
        }
        return false;
        */
    }
}

