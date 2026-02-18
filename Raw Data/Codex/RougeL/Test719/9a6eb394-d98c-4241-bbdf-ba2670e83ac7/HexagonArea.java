import java.util.Scanner;

public class HexagonArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of a side of the hexagon: ");
        double sideLength = scanner.nextDouble();

        // Handle invalid input (side length cannot be negative or zero)
        if (sideLength <= 0) {
            System.out.println("Invalid input. Side length must be positive.");
            return; // Exit the program
        }

        double area = (3 * Math.sqrt(3) * sideLength * sideLength) / 2;

        System.out.println("The area of the hexagon is: " + area);


        // Test cases (hardcoded for demonstration - ideally these would be in a separate testing framework)
        double testSide1 = 5;
        double expectedArea1 = (3 * Math.sqrt(3) * testSide1 * testSide1) / 2;
        System.out.println("Test Case 1: Side = " + testSide1 + ", Expected Area = " + expectedArea1);


        double testSide2 = 1; // Corner case: small side
        double expectedArea2 = (3 * Math.sqrt(3) * testSide2 * testSide2) / 2;
        System.out.println("Test Case 2: Side = " + testSide2 + ", Expected Area = " + expectedArea2);

        double testSide3 = 100; // Corner case: large side
        double expectedArea3 = (3 * Math.sqrt(3) * testSide3 * testSide3) / 2;
        System.out.println("Test Case 3: Side = " + testSide3 + ", Expected Area = " + expectedArea3);


        // Corner case: Invalid Input
        double testSide4 = -2;
        System.out.println("Test Case 4: Side = " + testSide4 + ", Expected: Invalid Input message");


        double testSide5 = 0; // Corner case: zero side length
        System.out.println("Test Case 5: Side = " + testSide5 + ", Expected: Invalid Input message");



        scanner.close();


    }
}
