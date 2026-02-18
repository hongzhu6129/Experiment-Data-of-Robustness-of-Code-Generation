import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PolygonArea {

    public static double calculateArea(List<Point> vertices) {
        if (vertices.size() < 3) {
            return 0; // Not a polygon
        }

        double area = 0.0;
        int n = vertices.size();

        for (int i = 0; i < n; i++) {
            Point p1 = vertices.get(i);
            Point p2 = vertices.get((i + 1) % n); // Wrap around to the first vertex for the last edge
            area += (p1.x * p2.y - p2.x * p1.y);
        }

        return Math.abs(area) / 2.0;
    }

    static class Point {
        double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int numVertices = scanner.nextInt();

        List<Point> vertices = new ArrayList<>();
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Enter x and y coordinates of vertex " + (i + 1) + ": ");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            vertices.add(new Point(x, y));
        }

        double area = calculateArea(vertices);
        System.out.println("Area of the polygon: " + area);

        scanner.close();

       // Test cases (you would typically separate these into a proper test class like JUnit)
        runTests();

    }



    public static void runTests() {
        // Test cases
        List<Point> triangle = new ArrayList<>();
        triangle.add(new Point(0, 0));
        triangle.add(new Point(0, 5));
        triangle.add(new Point(5, 0));
        assert calculateArea(triangle) == 12.5 : "Triangle test failed";


        List<Point> square = new ArrayList<>();
        square.add(new Point(0, 0));
        square.add(new Point(0, 2));
        square.add(new Point(2, 2));
        square.add(new Point(2, 0));
        assert calculateArea(square) == 4 : "Square test failed";



        List<Point> concaveQuad = new ArrayList<>();
        concaveQuad.add(new Point(0,0));
        concaveQuad.add(new Point(3,4));
        concaveQuad.add(new Point(5,1));
        concaveQuad.add(new Point(2,0));
        assert  Math.abs(calculateArea(concaveQuad) - 9.5) < 1e-9 : "Concave quad test failed"; // Use 1e-9 to compare floating point

        // Corner cases

        List<Point> twoPoints = new ArrayList<>();
        twoPoints.add(new Point(0, 0));
        twoPoints.add(new Point(1, 1));
        assert calculateArea(twoPoints) == 0 : "Two points test failed";


        List<Point> onePoint = new ArrayList<>();
        onePoint.add(new Point(0, 0));
        assert calculateArea(onePoint) == 0 : "One point test failed";

        List<Point> emptyList = new ArrayList<>();
        assert calculateArea(emptyList) == 0 : "Empty list test failed";

         List<Point> collinearPoints = new ArrayList<>();
        collinearPoints.add(new Point(0, 0));
        collinearPoints.add(new Point(1, 1));
        collinearPoints.add(new Point(2, 2));
        assert calculateArea(collinearPoints) == 0 : "Collinear points test failed";


        System.out.println("All tests passed!");

    }
}
