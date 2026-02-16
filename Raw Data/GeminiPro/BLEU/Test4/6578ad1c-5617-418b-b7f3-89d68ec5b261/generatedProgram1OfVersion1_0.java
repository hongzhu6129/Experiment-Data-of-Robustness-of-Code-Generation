import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
            return; // Exit the program if radius is negative
        }

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("Perimeter is = %.15f\n", perimeter); // Increased precision for comparison
        System.out.printf("Area is = %.15f\n", area);       // Increased precision for comparison

        input.close(); 
    }
}
