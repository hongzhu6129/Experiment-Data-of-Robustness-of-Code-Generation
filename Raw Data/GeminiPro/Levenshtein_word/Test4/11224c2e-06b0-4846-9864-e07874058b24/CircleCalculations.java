import java.util.Scanner;

public class CircleCalculations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle in kilometers: ");
        double radius = input.nextDouble();

        // Calculate the perimeter (circumference)
        double perimeter = 2 * Math.PI * radius;

        // Calculate the area
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);

        input.close(); 
    }
}
