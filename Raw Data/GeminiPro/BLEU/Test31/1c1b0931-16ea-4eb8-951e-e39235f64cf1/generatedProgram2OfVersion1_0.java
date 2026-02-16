import org.junit.Test;
import org.junit.Assert; // JUnit library import

// ... rest of your DistanceBetweenTwoPoints class ...

@Test
public void testNewYorkToLosAngeles() {
    double lat1 = Math.toRadians(40.7128);
    double lon1 = Math.toRadians(-74.0060);
    double lat2 = Math.toRadians(34.0522);
    double lon2 = Math.toRadians(-118.2437);
    double expectedDistance = 3935.76;
    double earthRadius = 6371.01;
    double distance = earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

    Assert.assertEquals(expectedDistance, distance, 0.01); // Tolerance of 0.01 km
}

// ... more test methods for other cases ...
