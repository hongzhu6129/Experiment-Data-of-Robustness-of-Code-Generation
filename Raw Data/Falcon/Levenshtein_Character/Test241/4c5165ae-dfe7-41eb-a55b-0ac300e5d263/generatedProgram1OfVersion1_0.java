import java.util.Scanner;

public class HexagonArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of a side of the hexagon: ");
        double sideLength = scanner.nextDouble();


        if (sideLength <= 0) {
            System.out.println("Side length must be a positive value.");
        } else {
            double area = (3 * Math.sqrt(3) * sideLength * sideLength) / 2;
            System.out.println("The area of the hexagon is: " + area);
        }
        scanner.close();
    }
}


