import java.util.Scanner;

public class HexagonArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a side of the hexagon: ");
        double sideLength = input.nextDouble();

        // Handle invalid input (side length cannot be negative or zero)
        if (sideLength <= 0) {
            System.out.println("Error: Side length must be a positive value.");
            return; // Exit the program
        }


        double area = (3 * Math.sqrt(3) * sideLength * sideLength) / 2;

        System.out.printf("The area of the hexagon is: %.2f\n", area);
        input.close(); 
    }
}
