import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using Scanner for user input (optional - you can hardcode the radius)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble(); 
        input.close(); // Close the scanner

        // Example with hardcoded radius (as provided in the prompt):
        //double radius = 7.5;


        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Perimeter is = %.15f\n", perimeter); // Formatted to 15 decimal places for precision
        System.out.printf("Area is = %.15f\n", area);
    }
}
