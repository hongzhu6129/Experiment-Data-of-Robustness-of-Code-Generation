public class CubeChecker {

    public static void main(String[] args) {
        // Input (replace with user input if needed)
        int num = 8; 

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int num) {
        if (num < 0) { // Handle negative numbers (cube root is also negative)
             return isCube(-num);
         } else if (num == 0) {
            return true;
        }


        // Efficiently check if a number is a perfect cube using Math.cbrt() and integer checking
        double cubeRoot = Math.cbrt(num);
        return cubeRoot == (int) cubeRoot;

    }
}
