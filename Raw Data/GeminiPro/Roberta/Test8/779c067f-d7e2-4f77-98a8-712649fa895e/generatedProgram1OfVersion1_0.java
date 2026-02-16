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


        Rectangle rect2 = new Rectangle(7, 7); // Square
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());

         Rectangle rect3 = new Rectangle(0,5); //zero length
         System.out.println("Area: " + rect3.getArea());
         System.out.println("Perimeter: " + rect3.getPerimeter());

    }
}


class RectangleTest {

    @Test
    void getArea() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(50, rect.getArea());


    }
    @Test
    void getAreaZeroLength(){
        Rectangle rect = new Rectangle(0,5);
        assertEquals(0, rect.getArea());
    }

    @Test
     void getAreaSquare() {
        Rectangle rect = new Rectangle(7,7); //Testing with a square (special case of rectangle)
        assertEquals(49, rect.getArea());
    }



    @Test
    void getPerimeter() {
        Rectangle rect = new Rectangle(5, 10);
        assertEquals(30, rect.getPerimeter());


    }
      @Test
      void getPerimeterZeroLength() {
           Rectangle rect = new Rectangle(0,5);
          assertEquals(10, rect.getPerimeter());
     }


    @Test
    void getPerimeterSquare() {
        Rectangle rect = new Rectangle(7,7); //Testing with a square (special case of rectangle)
        assertEquals(28, rect.getPerimeter());
    }

    @Test
    void negativeInputLength() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, 10)); // Expecting an exception
    }


    @Test
    void negativeInputWidth() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, -10)); // Expecting an exception
    }



}


