import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Rectangle {
    double length;
    double width;

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
        System.out.println("Area of rectangle 1: " + rect1.getArea());
        System.out.println("Perimeter of rectangle 1: " + rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(7, 7); // Square case
        System.out.println("Area of rectangle 2: " + rect2.getArea());
        System.out.println("Perimeter of rectangle 2: " + rect2.getPerimeter());



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
    void testSquare() {  // Test case for a square (special case of rectangle)
        Rectangle rect = new Rectangle(7, 7);
        assertEquals(49, rect.getArea());
        assertEquals(28, rect.getPerimeter());
    }



    @Test
    void testZeroLength() { // Corner case: zero length
        Rectangle rect = new Rectangle(0, 10);
        assertEquals(0, rect.getArea());
        assertEquals(20, rect.getPerimeter());

    }
        @Test
    void testZeroWidth() { // Corner case: zero width
        Rectangle rect = new Rectangle(5, 0);
        assertEquals(0, rect.getArea());
        assertEquals(10, rect.getPerimeter());

    }



    @Test
    void testNegativeLength() { // Handling invalid input: negative length
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(-5, 10); // Expecting exception
        });

    }
    @Test
    void testNegativeWidth() { // Handling invalid input: negative width
       assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(5, -10); // Expecting exception
        });
    }


    @Test
    void testLargeNumbers() { // Testing with larger numbers to check for potential overflow issues
        Rectangle rect = new Rectangle(100000, 100000);
        assertEquals(10000000000.0, rect.getArea());
        assertEquals(400000, rect.getPerimeter());
    }


    @Test
    void testDoubleValues() { // Testing with double values
        Rectangle rect = new Rectangle(3.5, 6.2);
        assertEquals(21.7, rect.getArea());
        assertEquals(19.4, rect.getPerimeter());

    }




}
