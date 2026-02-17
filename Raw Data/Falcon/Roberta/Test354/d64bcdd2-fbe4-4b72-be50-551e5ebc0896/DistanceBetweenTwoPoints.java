import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the latitude of coordinate 1: ");
        double x1 = Math.toRadians(input.nextDouble()); // Convert to radians

        System.out.print("Input the longitude of coordinate 1: ");
        double y1 = Math.toRadians(input.nextDouble()); // Convert to radians

        System.out.print("Input the latitude of coordinate 2: ");
        double x2 = Math.toRadians(input.nextDouble()); // Convert to radians

        System.out.print("Input the longitude of coordinate 2: ");
        double y2 = Math.toRadians(input.nextDouble()); // Convert to radians


        double radius = 6371.01; // Earth's radius in kilometers

        double distance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));


        System.out.println("The distance between those points is: " + distance);

        input.close(); 
    }
}


