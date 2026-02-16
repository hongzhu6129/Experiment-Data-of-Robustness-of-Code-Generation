import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        // Using Scanner for user input (optional - you can hardcode radius as 7.5)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble(); 
        input.close();


        // Calculate perimeter (circumference) and area
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Print the results with appropriate formatting
        System.out.printf("Perimeter is = %.10f\n", perimeter); // Using %.10f for 10 decimal places
        System.out.printf("Area is = %.10f\n", area);        // Using %.10f for 10 decimal places

        // Hardcoded test case (radius = 7.5) - for demonstration
       testCalculateCircle(7.5, 47.1238898038, 176.7145867644);


    }



    // Test cases function for better code practice
     public static void testCalculateCircle(double radius, double expectedPerimeter, double expectedArea){
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        if (Math.abs(perimeter - expectedPerimeter) < 1e-9 && Math.abs(area - expectedArea) < 1e-9) {
            System.out.println("Test passed for radius " + radius);
        } else {
            System.out.println("Test failed for radius " + radius);
            System.out.println("Expected perimeter: " + expectedPerimeter + ", Actual perimeter: " + perimeter);
            System.out.println("Expected area: " + expectedArea + ", Actual area: " + area);
        }

    }

}
