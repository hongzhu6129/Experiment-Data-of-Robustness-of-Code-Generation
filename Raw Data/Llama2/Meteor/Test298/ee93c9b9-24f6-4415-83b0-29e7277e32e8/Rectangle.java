public class Rectangle {

    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;
        double density = 5; // Density is not used in area or perimeter calculations

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("area is " + width + " * " + height + " = " + String.format("%.2f", area));
        System.out.println("perimeter is 2 * (" + width + " + " + height + ") = " + String.format("%.2f", perimeter));
    }
}
