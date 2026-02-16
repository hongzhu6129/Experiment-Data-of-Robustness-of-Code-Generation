import java.util.Scanner;

public class HexagonArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of a side of the regular hexagon: ");
        double sideLength = scanner.nextDouble();

        // Handle invalid input (side length cannot be negative or zero)
        if (sideLength <= 0) {
            System.out.println("Invalid input. Side length must be positive.");
            return; // Exit the program
        }

        double area = (3 * Math.sqrt(3) * sideLength * sideLength) / 2;

        System.out.println("The area of the hexagon is: " + area);

        scanner.close();



        // Test cases (inline within main - as requested - not ideal practice but fulfills the prompt):
        double side1 = 5;
        double expectedArea1 = (3 * Math.sqrt(3) * side1 * side1) / 2;
        System.out.println("Test case 1: side = " + side1 + ", expected area = " + expectedArea1);



        double side2 = 1; // Edge case: small side
        double expectedArea2 = (3 * Math.sqrt(3) * side2 * side2) / 2;
        System.out.println("Test case 2: side = " + side2 + ", expected area = " + expectedArea2);


        double side3 = 100; // Edge Case: large side
        double expectedArea3 = (3 * Math.sqrt(3) * side3 * side3) / 2;
        System.out.println("Test case 3: side = " + side3 + ", expected area = " + expectedArea3);

    }
}
