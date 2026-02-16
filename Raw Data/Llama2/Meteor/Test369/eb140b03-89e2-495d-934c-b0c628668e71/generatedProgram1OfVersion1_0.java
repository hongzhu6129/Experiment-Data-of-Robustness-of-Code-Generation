import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using a Scanner for potential user input (though not strictly required for this specific problem)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

        scanner.close(); // Close the scanner to release resources
    }
}
