public class HoneycombNumber {

    public static void main(String[] args) {
        // Input number (replace with user input if needed)
        int num = 8;

        // Check if the number is a perfect cube (and therefore a "honeycomb" number in this context)
        int cubeRoot = (int) Math.round(Math.cbrt(num)); // Calculate the integer cube root
        if (cubeRoot * cubeRoot * cubeRoot == num) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
    }
}
