import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();


        // Input validation:  Length and width cannot be negative or zero.
        if (length <= 0 || width <= 0) {
            System.out.println("Error: Length and width must be positive values.");
            return; // Exit the program if input is invalid
        }


        double area = calculateArea(length, width);
        double perimeter = calculatePerimeter(length, width);  // More common term than "fence"

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter (fence) of the rectangle: " + perimeter);

        scanner.close();
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculatePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}
