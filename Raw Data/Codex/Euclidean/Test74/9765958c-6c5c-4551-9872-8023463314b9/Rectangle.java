import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 10);
        System.out.println("Rectangle 1:");
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(7, 7); // Square case
        System.out.println("\nRectangle 2 (Square):");
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());


        Rectangle rectangle3 = new Rectangle(0, 5); // Zero length case
        System.out.println("\nRectangle 3 (Zero length):");
        System.out.println("Area: " + rectangle3.getArea());
        System.out.println("Perimeter: " + rectangle3.getPerimeter());


    }
}



class RectangleTest {

    @Test
    void testGetArea() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50, rectangle.getArea());
    }

    @Test
    void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(30, rectangle.getPerimeter());
    }


    @Test
    void testSquareArea() {
        Rectangle square = new Rectangle(7, 7); // Testing a square
        assertEquals(49, square.getArea());
    }

    @Test
    void testSquarePerimeter() {
        Rectangle square = new Rectangle(7, 7); // Testing a square
        assertEquals(28, square.getPerimeter());
    }

    @Test
    void testZeroLength() {  // Corner case: zero length
        Rectangle rectangle = new Rectangle(0, 5);
        assertEquals(0, rectangle.getArea());
        assertEquals(10, rectangle.getPerimeter());
    }

    @Test
    void testZeroWidth() {  // Corner case: zero width
        Rectangle rectangle = new Rectangle(5, 0);
        assertEquals(0, rectangle.getArea());
        assertEquals(10, rectangle.getPerimeter());
    }


    @Test
    void testNegativeLength() { // Handling invalid input: negative length (You might choose to throw an exception instead)
        Rectangle rectangle = new Rectangle(-5, 10);
        assertEquals(-50, rectangle.getArea()); // Area can be negative mathematically
        assertEquals(10, rectangle.getPerimeter());
    }

    @Test
    void testNegativeWidth() { // Handling invalid input: negative width
        Rectangle rectangle = new Rectangle(5, -10);
        assertEquals(-50, rectangle.getArea());
        assertEquals(-10, rectangle.getPerimeter());

    }

    @Test
    void testLargeNumbers() { // Testing with large numbers to check for potential overflow issues
        Rectangle rectangle = new Rectangle(100000000, 100000000);
        assertEquals(10000000000000000L, rectangle.getArea()); // Use long to compare
        assertEquals(400000000, rectangle.getPerimeter());


    }






}
