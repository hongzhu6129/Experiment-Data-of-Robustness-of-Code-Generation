import java.util.Scanner;

public class CubeChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();

        double cubeRoot = Math.cbrt(num); // Calculate the cube root

        if (cubeRoot == (int) cubeRoot) { // Check if the cube root is an integer
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
        input.close();
    }
}
