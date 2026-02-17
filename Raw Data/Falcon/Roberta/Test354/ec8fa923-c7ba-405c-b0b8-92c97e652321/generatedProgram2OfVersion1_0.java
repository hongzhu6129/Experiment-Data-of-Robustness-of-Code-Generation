// Example of a simple test method (without JUnit)

public static void testDistance(double lat1, double lon1, double lat2, double lon2, double expected) {
    double actual = calculateDistance(lat1, lon1, lat2, lon2); // Assuming you extracted your distance calculation into a separate method
    if (Math.abs(actual - expected) < 0.001) { // Using a tolerance for comparison due to floating-point precision
        System.out.println("Test Passed");
    } else {
        System.out.println("Test Failed: Expected " + expected + ", Actual " + actual);
    }
}

 // ... (in your main method or elsewhere)
testDistance(25, 35, 35.5, 25.5, 1480.0848); // Example test call
// ... (add more test calls)

