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


        Rectangle rect3 = new Rectangle(0, 5); //Zero length
        System.out.println("Area of rectangle 3: " + rect3.getArea());
        System.out.println("Perimeter of rectangle 3: " + rect3.getPerimeter());


    }
}


class RectangleTest {

    @Test
    void getArea_positiveLengthAndWidth() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(50, rect.getArea());
    }

    @Test
    void getPerimeter_positiveLengthAndWidth() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(30, rect.getPerimeter());
    }

    @Test
    void getArea_zeroLength() {  // Corner case: Zero length
        Rectangle rect = new Rectangle(0, 10);
        assertEquals(0, rect.getArea());
    }


    @Test
    void getPerimeter_zeroLength() { // Corner case: Zero length
        Rectangle rect = new Rectangle(0, 10);
        assertEquals(20, rect.getPerimeter());
    }


    @Test
    void getArea_zeroWidth() {  // Corner case: Zero width
        Rectangle rect = new Rectangle(5, 0);
        assertEquals(0, rect.getArea());
    }


    @Test
    void getPerimeter_zeroWidth() { // Corner case: Zero width
        Rectangle rect = new Rectangle(5, 0);
        assertEquals(10, rect.getPerimeter());
    }



    @Test
    void getArea_square() { // Test case: Square (length == width)
        Rectangle rect = new Rectangle(7, 7);
        assertEquals(49, rect.getArea());
    }

    @Test
    void getPerimeter_square() { // Test case: Square (length == width)
        Rectangle rect = new Rectangle(7, 7);
        assertEquals(28, rect.getPerimeter());
    }


    @Test
    void getArea_largeNumbers() {  // Test case: Larger numbers
        Rectangle rect = new Rectangle(1000, 2000);
        assertEquals(2000000, rect.getArea());
    }


    @Test
    void getPerimeter_largeNumbers() {  // Test case: Larger numbers
        Rectangle rect = new Rectangle(1000, 2000);
        assertEquals(6000, rect.getPerimeter());
    }



}
