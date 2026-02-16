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


        // Demonstrating handling of invalid input (could be expanded)
        try {
            Rectangle rect3 = new Rectangle(-2, 5);  // Example of throwing exception for invalid input
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


class RectangleTest {
    @Test
    void testGetArea() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(50, rect.getArea());  // Standard case

        rect = new Rectangle(7, 7); // Square
        assertEquals(49, rect.getArea());

        rect = new Rectangle(0, 10); // Zero length
        assertEquals(0, rect.getArea());

        rect = new Rectangle(10,0); // Zero Width
        assertEquals(0,rect.getArea());


    }

    @Test
    void testGetPerimeter() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(30, rect.getPerimeter()); // Standard case

        rect = new Rectangle(7, 7); // Square
        assertEquals(28, rect.getPerimeter());

        rect = new Rectangle(0,10); // Zero length
        assertEquals(20,rect.getPerimeter());

        rect = new Rectangle(10,0); // Zero Width
        assertEquals(20,rect.getPerimeter());



    }

     @Test
    void testInvalidInput() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(-2, 5); // Negative length
        });


        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(5,-2); // Negative width
        });


    }
}
