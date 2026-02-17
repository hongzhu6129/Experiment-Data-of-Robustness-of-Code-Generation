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
        Rectangle rect1 = new Rectangle(5, 10);
        System.out.println("Area of rect1: " + rect1.getArea());
        System.out.println("Perimeter of rect1: " + rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(7, 7); // Square
        System.out.println("Area of rect2: " + rect2.getArea());
        System.out.println("Perimeter of rect2: " + rect2.getPerimeter());
    }
}


class RectangleTest {

    @Test
    void testNormalRectangle() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(50, rect.getArea());
        assertEquals(30, rect.getPerimeter());
    }

    @Test
    void testSquare() {
        Rectangle rect = new Rectangle(7, 7);
        assertEquals(49, rect.getArea());
        assertEquals(28, rect.getPerimeter());
    }


    @Test
    void testZeroLength() {
        Rectangle rect = new Rectangle(0, 10);
        assertEquals(0, rect.getArea());
        assertEquals(20, rect.getPerimeter());
    }

    @Test
    void testZeroWidth() {
        Rectangle rect = new Rectangle(5, 0);
        assertEquals(0, rect.getArea());
        assertEquals(10, rect.getPerimeter());
    }

    @Test
    void testZeroLengthAndWidth() {  // Corner case: Both dimensions zero
        Rectangle rect = new Rectangle(0, 0);
        assertEquals(0, rect.getArea());
        assertEquals(0, rect.getPerimeter());
    }


    @Test
    void testNegativeLength() { //Handling invalid input
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, 10));
    }


    @Test
    void testNegativeWidth() { //Handling invalid input
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, -10));
    }


    @Test
    void testLargeNumbers() { // Check for potential overflow or precision issues
        Rectangle rect = new Rectangle(Double.MAX_VALUE / 2, Double.MAX_VALUE / 2); // Large dimensions
        assertTrue(Double.isInfinite(rect.getArea())); // Expecting infinity as we exceed the maximum value
        assertTrue(Double.isInfinite(rect.getPerimeter()));
    }



    @Test
    void testSmallNumbers() {  // Handle very small numbers
       Rectangle rect = new Rectangle(0.0000001, 0.0000001);
        assertEquals(0.0000000000001, rect.getArea(), 0.00000000000001); // Using a delta for comparison
        assertEquals(0.0000002, rect.getPerimeter(), 0.00000000000001);
    }

}
