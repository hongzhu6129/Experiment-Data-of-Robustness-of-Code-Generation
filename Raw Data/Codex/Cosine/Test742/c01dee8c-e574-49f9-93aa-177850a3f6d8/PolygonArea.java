import java.util.Scanner;

public class PolygonArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of sides on the polygon: ");
        int n = input.nextInt();

        System.out.print("Input the length of one of the sides: ");
        double s = input.nextDouble();

        if (n < 3 || s <= 0) {
            System.out.println("Invalid input. Number of sides must be 3 or more and side length must be positive.");
            return; // Exit if input is invalid
        }

        double area = calculatePolygonArea(n, s);

        System.out.println("The area is: " + area);

        input.close();
    }

    public static double calculatePolygonArea(int n, double s) {
        return (n * s * s) / (4 * Math.tan(Math.PI / n));
    }
}
