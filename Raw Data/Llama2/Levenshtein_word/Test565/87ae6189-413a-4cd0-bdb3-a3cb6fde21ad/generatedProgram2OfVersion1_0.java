import java.util.Scanner;

public class CubeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        scanner.close(); // Close the scanner

        if (isCube(number)) {  // ... (rest of the code is the same)
