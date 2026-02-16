import java.util.Scanner;

public class HexagonArea {

    public static double computeHexagonArea(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be a positive value.");
        }
        return (3 * Math.sqrt(3) * side * side) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side length of the hexagon: ");
        double side = scanner.nextDouble();


        try {
            double area = computeHexagonArea(side);
            System.out.println("The area of the hexagon is: " + area);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
