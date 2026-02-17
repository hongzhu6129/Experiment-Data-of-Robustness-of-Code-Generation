import java.util.Scanner;

public class HexagonArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of a side of the hexagon: ");
        double side = input.nextDouble();

        if (side <= 0) {
            System.out.println("Side length must be positive.");
        } else {
            double area = (3 * Math.sqrt(3) * side * side) / 2;
            System.out.println("The area of the hexagon is: " + area);
        }
        input.close(); // Close the scanner

    }
}
