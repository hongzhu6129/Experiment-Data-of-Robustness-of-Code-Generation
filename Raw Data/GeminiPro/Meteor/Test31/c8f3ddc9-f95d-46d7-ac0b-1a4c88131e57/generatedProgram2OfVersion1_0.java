// ... (rest of the code)

public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
    double radius = 6371.01;
    return radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
}

public static void main(String[] args) {
    // ... (input code if you want to keep it)


    // Example of an automated test:
    double expected = 1480.0848451069087;
    double actual = calculateDistance(Math.toRadians(25), Math.toRadians(35), Math.toRadians(35.5), Math.toRadians(25.5));
    if (Math.abs(actual - expected) < 0.0001) {  // Use a small tolerance for comparison
        System.out.println("Test case 1 passed");
    } else {
        System.out.println("Test case 1 failed");
    }

     // Add more test cases like this...

}
