import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sides of the triangle:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (is_Valid(a, b, c)) {
            double area = area_triangle(a, b, c);
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println("Invalid triangle sides.");
        }
        scanner.close();
    }

    public static boolean is_Valid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0);
    }

    public static double area_triangle(double a, double b, double c) {
        double s = (a + b + c) / 2; // Calculate semi-perimeter
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
        return area;
    }
}
