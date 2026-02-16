import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using a Scanner to allow user input (optional - you can hardcode the radius)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble(); 
        scanner.close(); // Close the scanner when finished

        // Calculate the perimeter (circumference)
        double perimeter = 2 * Math.PI * radius;

        // Calculate the area
        double area = Math.PI * radius * radius;

        // Print the results
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

    }
}
