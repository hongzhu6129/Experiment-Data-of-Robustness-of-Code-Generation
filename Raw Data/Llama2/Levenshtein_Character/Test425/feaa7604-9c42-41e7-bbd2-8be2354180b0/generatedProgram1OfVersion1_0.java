public class CubeChecker {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide exactly one integer argument.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);

            if (n < 0) {  // Handle negative numbers efficiently
                n = -n; 
                double cubeRoot = Math.cbrt(n);
                if (Math.abs(cubeRoot - Math.round(cubeRoot)) < 1e-10) {  // Check for perfect cube using a tolerance for double precision
                    System.out.println("number is a cube.");
                } else {
                    System.out.println("number is not a cube.");
                }
            } else {
                double cubeRoot = Math.cbrt(n);
                 if (Math.abs(cubeRoot - Math.round(cubeRoot)) < 1e-10) { 
                    System.out.println("number is a cube.");
                } else {
                    System.out.println("number is not a cube.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
