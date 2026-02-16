public class CircleCalculations {

    public static void main(String[] args) {
        double radius = 7.5; // Given width (assuming it's the diameter), radius is half of it
        double diameter = 2* radius;
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("width = " + diameter); // Outputting the diameter
        System.out.println("perimeter is = " + perimeter);
        System.out.println("area is = " + area);
    }
}
