import java.util.Scanner;

public class CubeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();  // Get integer input from user
        input.close(); // Close the scanner

        if (isCube(number)) { // ... (rest of the code remains the same)
        }
       // ... rest of the code
    }
    // ... (isCube method remains the same)
}
