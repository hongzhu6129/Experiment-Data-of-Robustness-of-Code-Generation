class Rectangle {
    double length;
    double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate the perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {

        // Test cases (including corner cases)
        Rectangle rect1 = new Rectangle(5, 10);
        printRectangleDetails(rect1, "Rectangle 1");

        Rectangle rect2 = new Rectangle(0, 5); // Zero length
        printRectangleDetails(rect2, "Rectangle 2 (Zero length)");

        Rectangle rect3 = new Rectangle(7, 0); // Zero width
        printRectangleDetails(rect3, "Rectangle 3 (Zero width)");

        Rectangle rect4 = new Rectangle(0, 0); // Zero length and width
        printRectangleDetails(rect4, "Rectangle 4 (Zero length and width)");

        Rectangle rect5 = new Rectangle(-5, 10);  // Negative length (should ideally be handled)
        printRectangleDetails(rect5, "Rectangle 5 (Negative length)");


        Rectangle rect6 = new Rectangle(5, -10);  // Negative width (should ideally be handled)
        printRectangleDetails(rect6, "Rectangle 6 (Negative width)");

        Rectangle rect7 = new Rectangle(Double.MAX_VALUE, 1); // Very large length 
        printRectangleDetails(rect7, "Rectangle 7 (Very large length)");



    }

    // Helper function to print the details neatly
    public static void printRectangleDetails(Rectangle rect, String name) {
        System.out.println(name + ":");
        System.out.println("Length: " + rect.length);
        System.out.println("Width: " + rect.width);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
        System.out.println("--------------------");
    }
}
