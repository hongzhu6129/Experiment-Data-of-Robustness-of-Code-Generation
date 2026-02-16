import java.util.Scanner;

public class EarthDistance {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the latitude of coordinate 1: ");
        double lat1 = Math.toRadians(input.nextDouble()); // Convert to radians immediately

        System.out.print("Input the longitude of coordinate 1: ");
        double lon1 = Math.toRadians(input.nextDouble()); // Convert to radians immediately

        System.out.print("Input the latitude of coordinate 2: ");
        double lat2 = Math.toRadians(input.nextDouble()); // Convert to radians immediately

        System.out.print("Input the longitude of coordinate 2: ");
        double lon2 = Math.toRadians(input.nextDouble()); // Convert to radians immediately

        double radius = 6371.01; // Earth's radius in kilometers

        double distance = radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

        System.out.println("The distance between those points is: " + distance);
        input.close(); 
    }
}


