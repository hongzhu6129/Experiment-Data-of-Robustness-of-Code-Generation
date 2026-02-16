import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Rectangle {

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


        Rectangle rect2 = new Rectangle(2.5, 7.2);
        System.out.println("Area of rectangle 2: " + rect2.getArea());
        System.out.println("Perimeter of rectangle 2: " + rect2.getPerimeter());

       // Corner cases demonstrated in test cases below.
    }
}


class RectangleTest {

    @Test
    void testZeroDimensions() {
        Rectangle rect = new Rectangle(0, 0);
        assertEquals(0, rect.getArea());
        assertEquals(0, rect.getPerimeter());
    }


    @Test
    void testNegativeDimensions() {
        assertThrows(IllegalArgumentException.class, () -> {
           new Rectangle(-5, 10); // Length cannot be negative
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(5, -10); // Width cannot be negative
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(-5, -10); // Both negative
        });


    }
    @Test
    void testLargeNumbers() {
        Rectangle rect = new Rectangle(100000, 100000);
        assertEquals(10000000000.0, rect.getArea()); // Check for potential overflow issues
        assertEquals(400000, rect.getPerimeter());
    }

    @Test
    void testNormalRectangle(){
        Rectangle rect = new Rectangle(4, 7);
        assertEquals(28, rect.getArea());
        assertEquals(22, rect.getPerimeter());
    }



    @Test
    void testDecimalDimensions() {
        Rectangle rect = new Rectangle(2.5, 3.7);
        assertEquals(9.25, rect.getArea());
        assertEquals(12.4, rect.getPerimeter());
    }


}
