import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lengths of the three sides of the triangle: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (is_Valid(a, b, c)) {
            double area = area_triangle(a, b, c);
            System.out.printf("The area of the triangle is: %.2f\n", area);
        } else {
            System.out.println("Invalid triangle sides.");
        }

        scanner.close(); 
    }

    public static boolean is_Valid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static double area_triangle(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
