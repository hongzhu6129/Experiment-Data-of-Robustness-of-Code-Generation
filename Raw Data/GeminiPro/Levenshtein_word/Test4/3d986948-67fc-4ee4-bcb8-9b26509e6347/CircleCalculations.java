import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using Scanner for user input (optional - you can hardcode the radius)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        input.close();  // Close the scanner when done


        // Calculate perimeter (circumference) and area
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;


        // Print the results formatted to 2 decimal places
        System.out.printf("Perimeter is = %.2f\n", perimeter);
        System.out.printf("Area is = %.2f\n", area);


    }
}
