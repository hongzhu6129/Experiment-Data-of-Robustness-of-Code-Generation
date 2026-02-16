    public static double calculatePerimeter(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        return 2 * Math.PI * radius;
    }

    public static double calculateArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        return Math.PI * radius * radius;
    }
