import java.util.Scanner;

public class RectangleCalculations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the diagonal: ");
        double diagonal = scanner.nextDouble();

        System.out.print("Enter the length of one side: ");
        double side1 = scanner.nextDouble();

        if (side1 >= diagonal) {
            System.out.println("Invalid input: Side cannot be greater than or equal to the diagonal.");
            return; // Exit the program if input is invalid
        }



        double side2 = Math.sqrt(diagonal * diagonal - side1 * side1); //Pythagorean theorem

        double area = side1 * side2;
        double perimeter = 2 * (side1 + side2);

        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        scanner.close();

    }
}
