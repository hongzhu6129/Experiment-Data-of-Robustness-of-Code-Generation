import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using Scanner for user input (optional - you can directly set radius)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble(); 
        input.close(); // Close the scanner

        // Calculate perimeter and area
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;


        System.out.printf("Perimeter is = %.15f\n", perimeter); // Format to 15 decimal places for precision
        System.out.printf("Area is = %.15f\n", area);

       // Example with radius 7.5 (as per the prompt):
        radius = 7.5;
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
        System.out.println("\nFor radius 7.5:");
        System.out.printf("Perimeter is = %.15f\n", perimeter);
        System.out.printf("Area is = %.15f\n", area);

    }
}
