import java.util.Scanner;

public class EarthDistance {

    public static double distance(double x1, double y1, double x2, double y2) {
        double radius = 6371.01; // Earth's radius in kilometers
        x1 = Math.toRadians(x1); // Convert latitude to radians
        y1 = Math.toRadians(y1); // Convert longitude to radians
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        return radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input the latitude of coordinate 1: ");
        double lat1 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 1: ");
        double lon1 = input.nextDouble();
        System.out.print("Input the latitude of coordinate 2: ");
        double lat2 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 2: ");
        double lon2 = input.nextDouble();


        double distance12 = distance(lat1, lon1, lat2, lon2);
        System.out.println("The distance between point 1 and point 2 is: " + distance12);

         //Demonstrating for 3 points (add a third point)
        System.out.print("Input the latitude of coordinate 3: ");
        double lat3 = input.nextDouble();
        System.out.print("Input the longitude of coordinate 3: ");
        double lon3 = input.nextDouble();


        double distance13 = distance(lat1, lon1, lat3, lon3);
        double distance23 = distance(lat2, lon2, lat3, lon3);



        System.out.println("The distance between point 1 and point 3 is: " + distance13);
        System.out.println("The distance between point 2 and point 3 is: " + distance23);


        input.close();
    }
}
