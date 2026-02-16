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
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        Rectangle square = new Rectangle(5,5);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());


         Rectangle zeroRect = new Rectangle(0,5);
        System.out.println("Area: " + zeroRect.getArea());
        System.out.println("Perimeter: " + zeroRect.getPerimeter());

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
        Rectangle square = new Rectangle(5, 5);
        assertEquals(25, square.getArea());
        assertEquals(20, square.getPerimeter());
    }

    @Test
    void testZeroLength() {  // Corner case: Zero length
        Rectangle rect = new Rectangle(0, 10);
        assertEquals(0, rect.getArea());
        assertEquals(20, rect.getPerimeter());
    }

     @Test
    void testZeroWidth() {  // Corner case: Zero width
        Rectangle rect = new Rectangle(10, 0);
        assertEquals(0, rect.getArea());
        assertEquals(20, rect.getPerimeter());
    }




    @Test
    void testNegativeLength() { // Corner case: Negative length (could throw exception or handle it)
        Rectangle rect = new Rectangle(-5, 10);
        assertEquals(-50, rect.getArea()); // Or assertThrows(IllegalArgumentException.class, () -> ... )
        assertEquals(10, rect.getPerimeter());
    }
        @Test
    void testNegativeWidth() { // Corner case: Negative Width (could throw exception or handle it)
        Rectangle rect = new Rectangle(5, -10);
        assertEquals(-50, rect.getArea()); // Or assertThrows(IllegalArgumentException.class, () -> ... )
        assertEquals(-10, rect.getPerimeter());
    }
    


    @Test
    void testLargeNumbers() { // Check for potential overflow issues
        Rectangle rect = new Rectangle(Double.MAX_VALUE / 2, Double.MAX_VALUE / 2); // Example of how to make the number large

      //Assertions for very large numbers might require special handling based on expected overflow behaviour
        assertTrue(rect.getArea()>0);
       assertTrue(rect.getPerimeter()>0);
        //Example of a potential infinity check : assertEquals(Double.POSITIVE_INFINITY, rect.getArea());

    }
}




