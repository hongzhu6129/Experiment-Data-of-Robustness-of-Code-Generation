public class CubeChecker {

    public static void main(String[] args) {
        // Input data (replace with user input if needed)
        int number = 8; 

        // Check if the number is a cube using a brute-force approach 
        // (suitable for smaller numbers)
        boolean isCube = false;
        for (int i = 1; i * i * i <= Math.abs(number); i++) {
            if (i * i * i == Math.abs(number)) {
                isCube = true;
                break;
            }
        }

        //Handle negative numbers
        if (number < 0 && isCube) {
          // Negative numbers can be perfect cubes  
            System.out.println("Number is a cube."); 
        } else if (number >= 0 && isCube) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }
}
