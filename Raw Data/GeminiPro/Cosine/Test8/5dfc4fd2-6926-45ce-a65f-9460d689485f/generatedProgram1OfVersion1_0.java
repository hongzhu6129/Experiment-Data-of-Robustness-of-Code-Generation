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
        Rectangle rectangle1 = new Rectangle(5, 10);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());


        Rectangle rectangle2 = new Rectangle(7, 7); //Square
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

        // Test with a very small rectangle
        Rectangle rectangle3 = new Rectangle(0.5, 0.2);
        System.out.println("Area: " + rectangle3.getArea());
        System.out.println("Perimeter: " + rectangle3.getPerimeter());


    }
}


class RectangleTest {

    @Test
    void getArea_positiveValues() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(50, rectangle.getArea());
    }

    @Test
    void getPerimeter_positiveValues() {
        Rectangle rectangle = new Rectangle(5, 10);
        assertEquals(30, rectangle.getPerimeter());
    }

    @Test
    void getArea_zeroLength() {  // Corner case: zero length
        Rectangle rectangle = new Rectangle(0, 10);
        assertEquals(0, rectangle.getArea());
    }

    @Test
    void getPerimeter_zeroWidth() { // Corner case: Zero width
        Rectangle rectangle = new Rectangle(5, 0);
        assertEquals(10, rectangle.getPerimeter());

    }


    @Test
    void getArea_smallValues() {  // Testing with small values
        Rectangle rectangle = new Rectangle(0.5, 0.2);
        assertEquals(0.1, rectangle.getArea());
    }



    @Test
    void getArea_largeValues() { //Testing with Large values
        Rectangle rectangle = new Rectangle(1000, 2000);
        assertEquals(2000000, rectangle.getArea());

    }


    @Test
    void getPerimeter_square() { //Testing with a square
        Rectangle rectangle = new Rectangle(7, 7);
        assertEquals(28, rectangle.getPerimeter());

    }

    @Test
    void negativeInput_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, 10)); // Negative length
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, -10)); // Negative width
    }


}

