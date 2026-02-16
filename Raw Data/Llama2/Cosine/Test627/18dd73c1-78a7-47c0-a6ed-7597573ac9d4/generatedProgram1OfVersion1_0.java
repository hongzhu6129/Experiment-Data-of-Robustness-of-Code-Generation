import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using a Scanner for potential user input (though fixed in this example)
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble(); // Could be 7.5 for the given example
        input.close(); // Close the scanner to release resources

        // Calculate the perimeter (circumference)
        double perimeter = 2 * Math.PI * radius;

        // Calculate the area
        double area = Math.PI * radius * radius;

        // Print the results, formatted for clarity
        System.out.printf("Perimeter is = %.14f\n", perimeter); // Increased precision for comparison
        System.out.printf("Area is = %.14f\n", area);

    }
}
