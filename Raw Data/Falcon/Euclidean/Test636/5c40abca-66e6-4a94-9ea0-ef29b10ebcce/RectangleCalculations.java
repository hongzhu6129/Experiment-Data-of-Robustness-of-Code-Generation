public class RectangleCalculations {

    public static void main(String[] args) {
        double width = 5.6; // Corrected width to match expected output
        double height = 8.5;
        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area is " + width + " * " + height + " = " + String.format("%.2f", area));
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + String.format("%.2f", perimeter));
    }
}
