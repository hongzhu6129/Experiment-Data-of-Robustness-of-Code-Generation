import java.util.Scanner;

public class HexagonArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a side of the hexagon: ");
        double side = input.nextDouble();

        // Handle invalid input (side length cannot be negative or zero)
        if (side <= 0) {
            System.out.println("Invalid input. Side length must be positive.");
            return; // Exit the program
        }


        double area = (3 * Math.sqrt(3) * side * side) / 2;

        System.out.println("The area of the hexagon is: " + area);
        input.close();
    }
}
