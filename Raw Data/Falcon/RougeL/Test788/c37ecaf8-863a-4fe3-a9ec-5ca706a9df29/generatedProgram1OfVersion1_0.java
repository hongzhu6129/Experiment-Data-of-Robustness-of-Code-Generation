class PentagonArea {

    public static void main(String[] args) {
        int n = 5; // Number of sides (always 5 for a pentagon)
        double s = 6.0; // Length of a side

        double area = pentagon_area(n, s);
        System.out.println("Area of the pentagon: " + area);

        s = 10; // Example with a different side length
        area = pentagon_area(n,s);
        System.out.println("Area of the pentagon: " + area);

    }

    public static double pentagon_area(int n, double s) {
        // Calculate the area of a regular pentagon
        return (n * s * s) / (4 * Math.tan(Math.PI / n));
    }
}
