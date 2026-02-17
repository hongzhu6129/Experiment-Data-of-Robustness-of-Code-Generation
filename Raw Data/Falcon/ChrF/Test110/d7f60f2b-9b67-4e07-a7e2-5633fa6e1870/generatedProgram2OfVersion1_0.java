import java.util.Scanner;

public class CubeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isCube(num)) {
            System.out.println(num + " is a cube.");
        } else {
            System.out.println(num + " is not a cube.");
        }
        scanner.close();
    }

    // ... (isCube function remains the same)
}
