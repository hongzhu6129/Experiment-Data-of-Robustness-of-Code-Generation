import java.util.Scanner;

public class TilingArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the shape of the area to be tiled (rectangle, square, or triangle):");
        String shape = scanner.nextLine().toLowerCase();


        double area = 0;

        if (shape.equals("rectangle")) {
            System.out.println("Enter the length of the rectangle:");
            double length = scanner.nextDouble();
            System.out.println("Enter the width of the rectangle:");
            double width = scanner.nextDouble();
            if (length <= 0 || width <= 0) {
                System.out.println("Invalid input: Length and width must be positive.");
            } else {
                area = length * width;
            }

        } else if (shape.equals("square")) {
            System.out.println("Enter the side length of the square:");
            double side = scanner.nextDouble();
            if (side <= 0) {
                System.out.println("Invalid input: Side length must be positive.");
            } else {
                area = side * side;
            }

        } else if (shape.equals("triangle")) {
            System.out.println("Enter the base of the triangle:");
            double base = scanner.nextDouble();
            System.out.println("Enter the height of the triangle:");
            double height = scanner.nextDouble();
            if (base <= 0 || height <= 0) {
                System.out.println("Invalid input: Base and height must be positive.");
            } else {
                area = 0.5 * base * height;
            }

        } else {
            System.out.println("Invalid shape entered.");
        }

        if (area > 0) {  // Only print area if it was calculated correctly.
            System.out.println("The area to be tiled is: " + area);
        }

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
