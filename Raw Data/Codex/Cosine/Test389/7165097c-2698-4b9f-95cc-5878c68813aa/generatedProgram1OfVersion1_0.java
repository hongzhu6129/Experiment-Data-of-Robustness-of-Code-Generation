import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using a Scanner to potentially allow user input in the future
        Scanner input = new Scanner(System.in);

        // Default radius value
        double radius = 7.5;  

        // Calculate perimeter (circumference) and area
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Perimeter is = %.15f\n", perimeter); // Increased precision for demonstration
        System.out.printf("Area is = %.15f\n", area);

        input.close(); // Close the scanner
    }
}
