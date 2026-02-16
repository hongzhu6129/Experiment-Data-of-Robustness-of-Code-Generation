public class Rectangle {

    public static void main(String[] args) {
        double width = 5.5;
        double height = 8.5;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("area example " + width + " * " + height + " = " + String.format("%.2f", area));
        System.out.println("perimeter is 2 * (" + width + " + " + height + ") = " + String.format("%.2f", perimeter)); 
    }
}
