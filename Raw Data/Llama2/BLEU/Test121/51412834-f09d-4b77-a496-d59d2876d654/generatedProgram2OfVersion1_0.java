import java.util.Scanner;

public class EarthDistance {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double lat1, lon1, lat2, lon2;

        // Input validation loop for latitude 1
        do {
            System.out.print("Input the latitude of coordinate 1 (-90 to 90): ");
            lat1 = input.nextDouble();
        } while (lat1 < -90 || lat1 > 90);

        // ... similar validation loops for lon1, lat2, and lon2 ...

        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);



        double earthRadius = 6371.01; 
        double distance = earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

        System.out.println("The distance between those points is: " + distance);
        input.close();
    }
}
