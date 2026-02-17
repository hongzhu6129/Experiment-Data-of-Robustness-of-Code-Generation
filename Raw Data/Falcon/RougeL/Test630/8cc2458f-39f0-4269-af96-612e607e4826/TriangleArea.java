import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
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
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static double area_triangle(double a, double b, double c) {
        double s = (a + b + c) / 2; // Calculate semi-perimeter
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
        return area;
    }
}
