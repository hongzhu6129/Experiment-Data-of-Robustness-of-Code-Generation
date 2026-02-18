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
        System.out.println("Area of rectangle 2: " + rect2.getArea());
        System.out.println("Perimeter of rectangle 2: " + rect2.getPerimeter());

        Rectangle rect3 = new Rectangle(0, 5); //Degenerate case
        System.out.println("Area of rectangle 3: " + rect3.getArea());
        System.out.println("Perimeter of rectangle 3: " + rect3.getPerimeter());


    }
}



class RectangleTest {

    @Test
    void testGetArea() {
        assertEquals(50, new Rectangle(5, 10).getArea());
        assertEquals(49, new Rectangle(7, 7).getArea());
        assertEquals(0, new Rectangle(0, 5).getArea());      // Zero length/width
        assertEquals(0, new Rectangle(5, 0).getArea());      // Zero length/width
        assertEquals(2.5, new Rectangle(0.5, 5).getArea()); // Fractional dimensions
    }

    @Test
    void testGetPerimeter() {
        assertEquals(30, new Rectangle(5, 10).getPerimeter());
        assertEquals(28, new Rectangle(7, 7).getPerimeter());
        assertEquals(10, new Rectangle(0, 5).getPerimeter());     // Zero length/width
        assertEquals(10, new Rectangle(5, 0).getPerimeter());     // Zero length/width
        assertEquals(11, new Rectangle(0.5, 5).getPerimeter());  // Fractional dimensions



    }


    @Test
    void testNegativeInput(){
        assertThrows(IllegalArgumentException.class, ()-> new Rectangle(-5, 10)); // Negative length
        assertThrows(IllegalArgumentException.class, ()-> new Rectangle(5, -10)); // Negative width


    }

}
