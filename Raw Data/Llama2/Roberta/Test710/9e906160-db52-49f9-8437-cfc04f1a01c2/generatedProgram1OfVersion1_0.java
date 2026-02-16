public class CubeChecker {

    public static void main(String[] args) {
        // Input handling (assuming input is provided as a command-line argument)
        if (args.length != 1) {
            System.out.println("Please provide a single number as input.");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);

            // Check if the number is a cube
            boolean isCube = checkCube(num);

            if (isCube) {
                System.out.println("Number is a cube.");
            } else {
                System.out.println("Number is not a cube.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }



    private static boolean checkCube(int num) {
        // Efficiently check if num is a perfect cube
        double cubeRoot = Math.cbrt(num);   //Calculate Cube root
        return cubeRoot == Math.round(cubeRoot); // Check if the cube root is an integer (perfect cube)
    }
}
