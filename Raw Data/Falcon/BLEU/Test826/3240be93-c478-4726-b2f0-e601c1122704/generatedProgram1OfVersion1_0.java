class Solution {
    /**
     * Checks if a triangle with given side lengths is valid.
     *
     * @param a The length of the first side.
     * @param b The length of the second side.
     * @param c The length of the third side.
     * @return True if the triangle is valid, false otherwise.
     */
    public static boolean is_Valid(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    /**
     * Calculates the area of a triangle using Heron's formula.
     *
     * @param a The length of the first side.
     * @param b The length of the second side.
     * @param c The length of the third side.
     * @return The area of the triangle, or -1 if the triangle is invalid.
     */
    public static double area_triangle(double a, double b, double c) {
        if (!is_Valid(a, b, c)) {
            return -1;
        }

        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Main method to demonstrate the triangle validation and area calculation.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        double a = 3, b = 4, c = 5;
        if (is_Valid(a, b, c)) {
            System.out.println("Triangle is valid.");
            double area = area_triangle(a, b, c);
            System.out.println("Area of the triangle: " + area);
        } else {
            System.out.println("Triangle is invalid.");
        }


        a = 1; b = 2; c = 5;
        if (is_Valid(a, b, c)) {
            System.out.println("Triangle is valid.");
            double area = area_triangle(a, b, c);
            System.out.println("Area of the triangle: " + area);
        } else {
            System.out.println("Triangle is invalid.");
        }
    }
}
