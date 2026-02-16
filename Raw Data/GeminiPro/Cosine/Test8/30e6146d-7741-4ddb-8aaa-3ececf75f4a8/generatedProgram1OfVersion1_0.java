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
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Perimeter of Square: " + square.getPerimeter());

         Rectangle longRectangle = new Rectangle(100,1);
         System.out.println("Area of Long Rectangle: " + longRectangle.getArea());
         System.out.println("Perimeter of Long Rectangle : " + longRectangle.getPerimeter());



    }
}


class RectangleTest {

    @Test
    void testGetArea() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(50, rect.getArea());  // Standard case

        rect = new Rectangle(0, 10); // Edge case: zero length
        assertEquals(0, rect.getArea());

        rect = new Rectangle(5, 0);  // Edge case: zero width
        assertEquals(0, rect.getArea());

        rect = new Rectangle(0,0); // Corner case: zero length and width
        assertEquals(0, rect.getArea());

        rect = new Rectangle(Double.MAX_VALUE, 1); //Extreme Case
        assertEquals(Double.MAX_VALUE, rect.getArea());


    }

    @Test
    void testGetPerimeter() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(30, rect.getPerimeter()); // Standard case

        rect = new Rectangle(0, 10); // Edge case
        assertEquals(20, rect.getPerimeter());

        rect = new Rectangle(5, 0);   // Edge case
        assertEquals(10, rect.getPerimeter());

        rect = new Rectangle(0,0);  // Corner case
        assertEquals(0, rect.getPerimeter());

        rect = new Rectangle(Double.MAX_VALUE, 1); //Extreme Case
        assertEquals(Double.POSITIVE_INFINITY, rect.getPerimeter());


    }




}

