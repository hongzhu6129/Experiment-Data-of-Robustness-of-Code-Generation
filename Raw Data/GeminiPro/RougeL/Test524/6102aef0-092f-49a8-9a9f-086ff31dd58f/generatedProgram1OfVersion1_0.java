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

    private static boolean isCube(int number) {
        if (number < 0) {
            return isCube(-number); // Handle negative numbers
        }

        // Efficient approach using integer cube root
        int cubeRoot = (int) Math.round(Math.cbrt(number));
        return cubeRoot * cubeRoot * cubeRoot == number;

        // Less efficient approach using a loop (for demonstration):
        /*
        for (int i = 0; i <= number; i++) {
            if (i * i * i == number) {
                return true; 
            }
             if (i*i*i > number) { //Optimization: break if exceeded
                 break;
             }
        }
        return false;
        */
    }
}
