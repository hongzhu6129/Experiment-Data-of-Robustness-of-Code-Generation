import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using Scanner for user input (optional - you can hardcode radius as 7.5)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();  // Close the scanner


        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
            return; // Exit the program if radius is negative
        }


        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
