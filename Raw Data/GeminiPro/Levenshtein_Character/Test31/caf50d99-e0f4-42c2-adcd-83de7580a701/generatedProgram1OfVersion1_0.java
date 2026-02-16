import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the latitude of coordinate 1: ");
        double latitude1 = Math.toRadians(input.nextDouble()); // Convert to radians

        System.out.print("Input the longitude of coordinate 1: ");
        double longitude1 = Math.toRadians(input.nextDouble()); // Convert to radians

        System.out.print("Input the latitude of coordinate 2: ");
        double latitude2 = Math.toRadians(input.nextDouble()); // Convert to radians

        System.out.print("Input the longitude of coordinate 2: ");
        double longitude2 = Math.toRadians(input.nextDouble()); // Convert to radians


        double earthRadius = 6371.01; // Earth's radius in kilometers

        double distance = earthRadius * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) +
                Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));


        System.out.println("The distance between those points is: " + distance);
        input.close();
    }
}


