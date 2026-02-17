import java.util.Scanner;

public class AverageAndRectangle {

    public static void main(String[] args) {

        // Calculate and print the average of three numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("The average is: " + average);



        // Calculate and print the area and perimeter of a rectangle
        double width = 5.5;
        double height = 8.5;
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        input.close(); // Close the scanner to release resources


    }
}
