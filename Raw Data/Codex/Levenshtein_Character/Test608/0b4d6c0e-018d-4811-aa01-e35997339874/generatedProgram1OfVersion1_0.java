class Solution {
    /**
     * Calculates the area of a regular pentagon.
     *
     * @param n    The number of sides of the pentagon (must be 5).
     * @param side The length of one side of the pentagon.
     * @return The area of the pentagon.
     */
    public static double pentagon_area(int n, double side) {
        if (n != 5) {
            throw new IllegalArgumentException("A pentagon must have 5 sides.");
        }
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be positive.");
        }
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
    }

    /**
     * Main method to demonstrate the pentagon_area function.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int n = 5;  // Number of sides (must be 5 for a pentagon)
        double side = 7; // Length of one side
        double area = pentagon_area(n, side);
        System.out.println("Area of pentagon: " + area);


        side = 10; // Length of one side
        area = pentagon_area(n, side);
        System.out.println("Area of pentagon: " + area);

        // Example with invalid input (should throw an exception)
        try {
            area = pentagon_area(6, 5); // Invalid number of sides
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            area = pentagon_area(5,-1); //Invalid side length
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
