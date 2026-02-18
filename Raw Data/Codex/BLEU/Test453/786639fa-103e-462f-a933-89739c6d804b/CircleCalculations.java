import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using a Scanner for potential user input (though fixed in this example)
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble(); // Can be changed for user input


        // Calculate the perimeter (circumference) and area
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Print the results formatted to several decimal places
        System.out.printf("Perimeter is = %.15f\n", perimeter);
        System.out.printf("Area is = %.15f\n", area);

        input.close(); // Close the Scanner

    }
}



