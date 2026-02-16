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
        if (number < 0) {  // Handle negative numbers (their cube roots are negative)
            return isCube(-number); 
        }

        // Binary Search approach for efficiency
        int low = 0;
        int high = number; 

        while(low <= high){
            int mid = low + (high - low)/2;  // prevent potential overflow

            long cube = (long)mid * mid * mid;  // Use long to handle potential overflow

            if(cube == number) return true;
            else if (cube < number) low = mid + 1;
            else high = mid - 1;
        }

        return false;

    }
}
