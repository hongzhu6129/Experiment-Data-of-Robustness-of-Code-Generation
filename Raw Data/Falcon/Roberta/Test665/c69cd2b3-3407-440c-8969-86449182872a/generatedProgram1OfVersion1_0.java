import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using Scanner for user input (optional - you can hardcode radius as 7.5)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();  // Close the scanner


        double perimeter = calculatePerimeter(radius);
        double area = calculateArea(radius);

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }

    public static double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}
