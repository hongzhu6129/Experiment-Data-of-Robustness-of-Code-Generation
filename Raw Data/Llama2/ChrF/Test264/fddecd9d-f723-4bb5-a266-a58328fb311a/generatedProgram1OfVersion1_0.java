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
        System.out.println("Area of rectangle 2 (square): " + rect2.getArea());
        System.out.println("Perimeter of rectangle 2 (square): " + rect2.getPerimeter());


        // Demonstrating handling of invalid input (commented out to avoid program termination)
        //Rectangle rect3 = new Rectangle(-2, 5); // Example of handling negative input -  see tests for how to handle this gracefully

    }
}



class RectangleTest {

    @Test
    void getArea_positiveValues() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(50, rect.getArea());
    }

    @Test
    void getPerimeter_positiveValues() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(30, rect.getPerimeter());
    }


    @Test
    void getArea_zeroLength() {
        Rectangle rect = new Rectangle(0, 10);
        assertEquals(0, rect.getArea());
    }

    @Test
    void getPerimeter_zeroWidth() {
        Rectangle rect = new Rectangle(5, 0);
        assertEquals(10, rect.getPerimeter()); // Perimeter should still be calculable
    }


     @Test
    void constructor_negativeLength_throwsIllegalArgumentException() {
         assertThrows(IllegalArgumentException.class, () -> {
                new Rectangle(-5, 10); // Expecting an exception
         });
    }

     @Test
    void constructor_negativeWidth_throwsIllegalArgumentException() {
         assertThrows(IllegalArgumentException.class, () -> {
                new Rectangle(5, -10); // Expecting an exception
         });
    }



    @Test
    void getArea_square() {  // Testing a square (special case of rectangle)
        Rectangle rect = new Rectangle(7, 7);
        assertEquals(49, rect.getArea());
    }




}
