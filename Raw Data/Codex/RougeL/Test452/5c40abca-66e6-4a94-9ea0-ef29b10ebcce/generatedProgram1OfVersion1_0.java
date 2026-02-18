import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();


        if (length < 0 || width < 0) {
            System.out.println("Error: Length and width cannot be negative.");
        } else {
            double area = length * width;
            double perimeter = 2 * (length + width);

            System.out.println("Area of the rectangle: " + area);
            System.out.println("Perimeter of the rectangle: " + perimeter);
        }

        input.close();
    }
}
