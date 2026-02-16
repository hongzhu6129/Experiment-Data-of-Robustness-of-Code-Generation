public static double calculatePerimeter(double radius) {
    if (radius < 0) {
        // Option 1: Throw an exception
        throw new IllegalArgumentException("Radius cannot be negative.");

        // Option 2: Return NaN (Not a Number)
        // return Double.NaN;  
    }
    return 2 * Math.PI * radius;
}

// Similar error handling can be added to the calculateArea() method.
