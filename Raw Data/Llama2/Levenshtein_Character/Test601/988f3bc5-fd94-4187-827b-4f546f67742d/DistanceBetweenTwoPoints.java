import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double latitude1, longitude1, latitude2, longitude2, distance;
        final double RADIUS = 6371.01;

        System.out.print("Input the latitude of coordinate 1: ");
        latitude1 = Math.toRadians(input.nextDouble());

        System.out.print("Input the longitude of coordinate 1: ");
        longitude1 = Math.toRadians(input.nextDouble());

        System.out.print("Input the latitude of coordinate 2: ");
        latitude2 = Math.toRadians(input.nextDouble());

        System.out.print("Input the longitude of coordinate 2: ");
        longitude2 = Math.toRadians(input.nextDouble());

        distance = RADIUS * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) +
                Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));

        System.out.println("The distance between those points is: " + distance);
        input.close();
    }
}
