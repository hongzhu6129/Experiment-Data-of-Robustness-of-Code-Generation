public class CubeChecker {

    public static void main(String[] args) {
        // Input handling (replace with your preferred method, e.g., Scanner)
        int number = 8; // Example input, replace with actual input

        if (isCube(number)) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }

    private static boolean isCube(int number) {
        // Handle negative numbers
        if (number < 0) {
            return isCube(-number); 
        }

         // Efficient cube root check using Math.cbrt() and comparing with rounded down value
        int cubeRoot = (int) Math.cbrt(number); //Cast to int to truncate decimal part

        return cubeRoot * cubeRoot * cubeRoot == number; 

    }
}
