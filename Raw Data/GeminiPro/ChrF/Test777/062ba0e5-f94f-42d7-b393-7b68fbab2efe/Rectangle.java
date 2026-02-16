public class Rectangle {

    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;
        double density = 5; // Density is not used in area or perimeter calculations

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.printf("area is %.2f * %.2f = %.2f\n", width, height, area);
        System.out.printf("perimeter is 2 * (%.2f + %.2f) = %.2f\n", width, height, perimeter); 
    }
}
