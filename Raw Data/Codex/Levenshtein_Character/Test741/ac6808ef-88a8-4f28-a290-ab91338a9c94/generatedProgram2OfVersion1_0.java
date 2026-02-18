import java.util.Scanner;

public class CubeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt(); // Get integer input from the user

        if (isPerfectCube(number)) { // ... (rest of the code as before)
        } else { // ...
        }
        scanner.close(); // Close the scanner when finished
    }
    // ... (isPerfectCube function as before)
}

