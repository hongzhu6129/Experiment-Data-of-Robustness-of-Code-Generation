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
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(7, 7); // Square
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());

        // Corner Case: Zero dimensions
         Rectangle rect3 = new Rectangle(0,5);
        System.out.println("Area: " + rect3.getArea());
        System.out.println("Perimeter: " + rect3.getPerimeter());




    }
}



class RectangleTest {

    @Test
    void getArea() {
        Rectangle rect1 = new Rectangle(5, 10);
        assertEquals(50, rect1.getArea());

        Rectangle rect2 = new Rectangle(7, 7);
        assertEquals(49, rect2.getArea());


        //Corner Cases
        Rectangle rect3 = new Rectangle(0, 5); //Zero length
        assertEquals(0, rect3.getArea());

        Rectangle rect4 = new Rectangle(5, 0);  // Zero width
        assertEquals(0, rect4.getArea());
        
        Rectangle rect5 = new Rectangle(0,0); // Zero length and width
        assertEquals(0, rect5.getArea());
    }

    @Test
    void getPerimeter() {
         Rectangle rect1 = new Rectangle(5, 10);
        assertEquals(30, rect1.getPerimeter());


          Rectangle rect2 = new Rectangle(7, 7);
        assertEquals(28, rect2.getPerimeter());


          //Corner Cases
        Rectangle rect3 = new Rectangle(0, 5); //Zero length
        assertEquals(10, rect3.getPerimeter());

          Rectangle rect4 = new Rectangle(5, 0);  // Zero width
        assertEquals(10, rect4.getPerimeter());

          Rectangle rect5 = new Rectangle(0,0); // Zero length and width
        assertEquals(0, rect5.getPerimeter());
    }


}


