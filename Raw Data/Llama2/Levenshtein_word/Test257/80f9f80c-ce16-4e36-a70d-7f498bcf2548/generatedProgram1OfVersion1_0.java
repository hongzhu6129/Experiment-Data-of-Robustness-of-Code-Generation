import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using a Scanner for potential user input in the future (easily adaptable).
        Scanner input = new Scanner(System.in);

        // For this specific problem, radius is fixed.
        double radius = 7.5; 

        // Calculate the perimeter (circumference)
        double perimeter = 2 * Math.PI * radius;

        // Calculate the area
        double area = Math.PI * radius * radius;

        // Print the results, formatted to match the example output.
        System.out.printf("fence is = %.12f\n", perimeter); // Formatted to 12 decimal places
        System.out.printf("area is = %.12f\n", area);      // Formatted to 12 decimal places


        input.close(); // Close the Scanner to prevent resource leaks.
    }
}


