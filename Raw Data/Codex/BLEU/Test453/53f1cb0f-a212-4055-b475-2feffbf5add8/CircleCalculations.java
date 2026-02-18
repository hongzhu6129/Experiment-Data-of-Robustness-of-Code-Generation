import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using a Scanner to potentially take input later (for testing)
        Scanner scanner = new Scanner(System.in);

        // Example usage with the given radius
        double radius = 9.5; 

        // Calculate perimeter (circumference) and area
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;


        System.out.printf("Perimeter is = %.15f\n", perimeter);  // Print with more precision
        System.out.printf("Area is = %.15f\n", area);


        // --- Testing with Scanner (optional - comment out if not needed) ---
        /*
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
        System.out.printf("Perimeter is = %.15f\n", perimeter);
        System.out.printf("Area is = %.15f\n", area);
        */
        scanner.close(); // Good practice to close the Scanner
    }
}
