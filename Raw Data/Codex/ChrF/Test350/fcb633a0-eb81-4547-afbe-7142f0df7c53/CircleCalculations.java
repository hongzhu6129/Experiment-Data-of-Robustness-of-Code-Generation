import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using a Scanner for potential user input (though currently fixed at 7.5)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble(); // Change this to input.nextDouble() for user input

        // Calculate the perimeter (circumference) and area
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Print the results formatted to a reasonable number of decimal places
        System.out.printf("Perimeter is = %.2f\n", perimeter);
        System.out.printf("Area is = %.2f\n", area);
        input.close(); // Close the scanner
    }
}
