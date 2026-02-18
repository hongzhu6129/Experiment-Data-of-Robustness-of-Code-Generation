import java.util.Scanner;

public class CubeChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();

        double cubeRoot = Math.cbrt(number);

        if (cubeRoot == (int) cubeRoot) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
        input.close(); 
    }
}
