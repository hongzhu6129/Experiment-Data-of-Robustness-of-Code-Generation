import java.util.Scanner;

public class CubeChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = input.nextInt();

        // Efficiently check if the cube root is an integer
        int cubeRoot = (int) Math.round(Math.cbrt(num));  //Round to nearest int due to potential floating point inaccuracies

        if (cubeRoot * cubeRoot * cubeRoot == num) {
            System.out.println("Number is a cube.");
        } else {
            System.out.println("Number is not a cube.");
        }
        input.close();
    }
}
