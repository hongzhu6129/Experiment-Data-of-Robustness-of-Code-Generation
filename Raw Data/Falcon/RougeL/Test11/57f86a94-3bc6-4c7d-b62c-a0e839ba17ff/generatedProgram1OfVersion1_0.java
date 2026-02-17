public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example, could be taken from user input)
        int num = 8; 

        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Test other cases:
        num = 27;
        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        num = 10;
        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

         num = -8; // Test for negative cubes
        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        num = 0;  // Test zero
         if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        num = 1; // test 1
        if (isCube(num)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }


    private static boolean isCube(int num) {
        // Handle negative numbers
        if (num < 0) {
            return isCube(-num); // Check the absolute value 
                                 // and negate the result appropriately
        }



        int cubeRoot = Math.round(Math.cbrt(num)); // Calculate cube root and round to nearest integer
        
        return cubeRoot * cubeRoot * cubeRoot == num;  //Efficiently check
    }


}
