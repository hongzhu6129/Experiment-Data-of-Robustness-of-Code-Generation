import java.util.Scanner;

public class CubeChecker {
    // ... (isCube method remains the same)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        if (isCube(number)) { // ... rest of the code
         // ...
        }
    }
}
