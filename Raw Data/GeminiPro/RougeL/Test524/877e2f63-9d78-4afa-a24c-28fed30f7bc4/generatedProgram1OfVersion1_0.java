public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example, ideally would be taken from user input)
        int num = 8; 

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            // The problem description says "check if a number is a cube or should"
            // It's unclear what "or should" means.  Assuming it means it's *not* a cube:
            System.out.println("Number is not a cube."); 
        }
    }

    private static boolean isCube(int num) {
        // Handle negative numbers (their cube roots are also negative)
        if (num < 0) {
            return isCube(-num);  // Check the absolute value
        }

        // Efficiently check for cubes using integer arithmetic
        int cbrt = (int) Math.round(Math.cbrt(num)); // Calculate the integer cube root
        return cbrt * cbrt * cbrt == num;           // Check if the cube of the root equals the number

        // Less Efficient Alternative (iterative approach):
        //for (int i = 0; i <= num; i++) {
        //    if (i * i * i == num) {
        //        return true;
        //    }
        //    if(i * i * i > num){ //optimization - if we overshoot num while i is positive, num cannot be a perfect cube.
        //        return false;
        //    }
        //}
        //return false;
    }
}
