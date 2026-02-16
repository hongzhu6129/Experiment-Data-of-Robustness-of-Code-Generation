import java.util.InputMismatchException;
import java.util.Scanner;

public class EarthDistance {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double lat1, lon1, lat2, lon2;

        while (true) { // Loop until valid input is received
            try {
                System.out.print("Input the latitude of coordinate 1 (-90 to 90): ");
                lat1 = input.nextDouble();
                if (lat1 < -90 || lat1 > 90) {
                    throw new InputMismatchException("Latitude must be between -90 and 90.");
                }

                System.out.print("Input the longitude of coordinate 1 (-180 to 180): ");
                lon1 = input.nextDouble();
                 if (lon1 < -180 || lon1 > 180) {
                    throw new InputMismatchException("Longitude must be between -180 and 180.");
                }


                System.out.print("Input the latitude of coordinate 2 (-90 to 90): ");
                lat2 = input.nextDouble();
                if (lat2 < -90 || lat2 > 90) {
                    throw new InputMismatchException("Latitude must be between -90 and 90.");
                }

                System.out.print("Input the longitude of coordinate 2 (-180 to 180): ");
                lon2 = input.nextDouble();
                 if (lon2 < -180 || lon2 > 180) {
                    throw new InputMismatchException("Longitude must be between -180 and 180.");
                }

                break; // Exit loop if input is valid

            } catch (InputMismatchException e) {
                System.out.println("Invalid input: " + e.getMessage());
                input.nextLine(); // Clear the invalid input from the scanner
            }
        }


        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);


        double radius = 6371.01; 

        double distance = radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

        System.out.println("The distance between those points is: " + distance);
        input.close();
    }
}
