public class CubeChecker {

    public static void main(String[] args) {
        // Input data (hardcoded for this example, ideally would be read from user input)
        int number = 8; 

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Test with a different number
         number = 27; 

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

        // Test with a negative number
         number = -27; 

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }


        // Test with zero
         number = 0; 

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }

          // Test with a non-cube number
         number = 10; 

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int number) {
        // Handle negative numbers:  Take the absolute value and check if its cube root is an integer, then negate the result if the original number was negative.
        int absNumber = Math.abs(number);
        
        //Efficiently check if a number is a perfect cube
        double cubeRoot = Math.cbrt(absNumber);
        return Math.round(cubeRoot) * Math.round(cubeRoot) * Math.round(cubeRoot) == absNumber;
    }
}
