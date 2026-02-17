import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void printAreaAndPerimeter(double length, double width) {
        if (length <= 0 || width <= 0) {
            System.out.println("Invalid dimensions. Length and width must be positive values.");
            return; // Or throw an exception if appropriate for your application
        }
        
        Rectangle rectangle = new Rectangle(length, width);
        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }


    public static void main(String[] args) {
        // Test cases (you can add more)
        printAreaAndPerimeter(5, 10);       // Normal case
        printAreaAndPerimeter(2.5, 7.8);    // Decimal values
        printAreaAndPerimeter(0, 5);        // Zero length
        printAreaAndPerimeter(-5, 10);      // Negative length
        printAreaAndPerimeter(5, -10);      // Negative width
        printAreaAndPerimeter(Double.MAX_VALUE, 1); // Large value
    }
}


class RectangleTest {
    @Test
    void testCalculateArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50, rectangle.calculateArea());
    }


    @Test
    void testCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(30, rectangle.calculatePerimeter());

    }

    @Test
    void testZeroLength() {
       Rectangle.printAreaAndPerimeter(0,5);
    }

    @Test
    void testNegativeLength() {
        Rectangle.printAreaAndPerimeter(-5, 10);
    }


    @Test
    void testLargeValues() {
        Rectangle.printAreaAndPerimeter(Double.MAX_VALUE, 1);
    }

}
