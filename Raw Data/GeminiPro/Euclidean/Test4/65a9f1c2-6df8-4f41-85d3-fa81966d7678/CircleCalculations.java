import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using a Scanner for potential user input (though this example uses a fixed radius)
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = 7.5; // Fixed radius for this example

        // Calculate the perimeter (circumference)
        double perimeter = 2 * Math.PI * radius;

        // Calculate the area
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter of the circle: " + perimeter);
        System.out.println("Area of the circle: " + area);

        input.close();  // Close the Scanner
    }
}
