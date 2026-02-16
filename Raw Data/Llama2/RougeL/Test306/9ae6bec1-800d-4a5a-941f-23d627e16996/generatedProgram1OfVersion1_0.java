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
    void testPositiveDimensions() {
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
        assertEquals(20, rect.getPerimeter()); // Perimeter is still calculable
    }

    @Test
    void testZeroWidth() {
        Rectangle rect = new Rectangle(5, 0);
        assertEquals(0, rect.getArea());
        assertEquals(10, rect.getPerimeter()); // Perimeter is still calculable
    }


    @Test
    void testNegativeLength() {

         assertThrows(IllegalArgumentException.class, () -> {
             new Rectangle(-5, 10);
         });
    }

    @Test
    void testNegativeWidth() {
         assertThrows(IllegalArgumentException.class, () -> {
             new Rectangle(5, -10);
        });
    }



    @Test
    void testLargeNumbers() {
        Rectangle rect = new Rectangle(100000, 100000);
        assertEquals(10000000000.0, rect.getArea());
        assertEquals(400000, rect.getPerimeter());
    }



    @Test
    void testDecimalDimensions() {
        Rectangle rect = new Rectangle(2.5, 3.7);
        assertEquals(9.25, rect.getArea());
        assertEquals(12.4, rect.getPerimeter());
    }
}
