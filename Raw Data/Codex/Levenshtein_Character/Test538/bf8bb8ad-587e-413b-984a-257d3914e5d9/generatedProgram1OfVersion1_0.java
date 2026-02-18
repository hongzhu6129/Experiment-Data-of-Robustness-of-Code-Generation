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
        System.out.println("Area: "+ square.getArea());
        System.out.println("Perimeter: "+ square.getPerimeter());


        // Test cases demonstrated below using JUnit
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
    void testZeroLength() {
        Rectangle rect = new Rectangle(0, 10); // Corner case: zero length
        assertEquals(0, rect.getArea());
        assertEquals(20, rect.getPerimeter());
    }

    @Test
    void testZeroWidth() {
        Rectangle rect = new Rectangle(5, 0); // Corner case: zero width
        assertEquals(0, rect.getArea());
        assertEquals(10, rect.getPerimeter());
    }

    @Test
    void testZeroLengthAndWidth(){
        Rectangle rect = new Rectangle(0,0); //Corner case: zero length and width
        assertEquals(0, rect.getArea());
        assertEquals(0, rect.getPerimeter());
    }


    @Test
    void testNegativeLength() {        //Robustness testing: negative input.  Should ideally throw an exception. Demonstrated below.
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, 10));
    }


     @Test
    void testLargeNumbers() {
        Rectangle rect = new Rectangle(100000, 100000);
        assertEquals(10000000000.0, rect.getArea());
        assertEquals(400000, rect.getPerimeter());
    }





}
