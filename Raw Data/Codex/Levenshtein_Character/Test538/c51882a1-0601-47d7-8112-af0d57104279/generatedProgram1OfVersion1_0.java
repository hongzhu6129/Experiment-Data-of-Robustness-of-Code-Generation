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

        Rectangle rect2 = new Rectangle(7, 7); // Square
        System.out.println("Area of rectangle 2 (Square): " + rect2.getArea());
        System.out.println("Perimeter of rectangle 2 (Square): " + rect2.getPerimeter());

        //Demonstrating handling of invalid input (commented out to avoid runtime error during normal execution)
        //Rectangle rect3 = new Rectangle(-2, 5); 
    }
}


class RectangleTest {
    @Test
    void testValidRectangle() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(50, rect.getArea());
        assertEquals(30, rect.getPerimeter());
    }

    @Test
    void testSquare() {
        Rectangle square = new Rectangle(7, 7);
        assertEquals(49, square.getArea());
        assertEquals(28, square.getPerimeter());
    }

    @Test
    void testZeroLength() {  //Corner Case
        Rectangle rect = new Rectangle(0, 10);
        assertEquals(0, rect.getArea());
        assertEquals(20, rect.getPerimeter());
    }


    @Test
    void testZeroWidth() {   //Corner Case
        Rectangle rect = new Rectangle(5, 0);
        assertEquals(0, rect.getArea());
        assertEquals(10, rect.getPerimeter());
    }

     @Test
    void testNegativeInput() { // Corner Case: Handling invalid input
        assertThrows(IllegalArgumentException.class, () -> {
             new Rectangle(-5, 10); // Expecting exception for negative length
        });

         assertThrows(IllegalArgumentException.class, () -> {
             new Rectangle(5, -10); // Expecting exception for negative width
        });
    }




    // Add more test cases as needed...  (Large numbers, decimal values etc.)
    @Test
    void testLargeNumbers() { 
        Rectangle rect = new Rectangle(10000, 5000);
        assertEquals(50000000, rect.getArea());
        assertEquals(30000, rect.getPerimeter());
    }

    @Test
    void testDecimalValues() {
        Rectangle rect = new Rectangle(2.5, 3.5);
        assertEquals(8.75, rect.getArea());
        assertEquals(12.0, rect.getPerimeter());
    }
}




