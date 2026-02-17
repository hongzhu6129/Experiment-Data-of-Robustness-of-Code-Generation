public class CircleCalculations {

    public static void main(String[] args) {
        double radius = 7.5; // Given width is interpreted as diameter, so radius is half of it.
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("perimeter is = " + perimeter);
        System.out.println("area is = " + area);
    }
}
