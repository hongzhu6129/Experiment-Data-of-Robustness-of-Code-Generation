import java.util.Scanner;

public class MileToKilometer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles: ");
        double miles = input.nextDouble();

        // The provided formula is incorrect. It should be 1 mile = 1.60934 kilometers
        double kilometers = miles * 1.60934; 

        System.out.println(miles + " miles is " + kilometers + " kilometers");

        input.close(); // Close the scanner to prevent resource leaks
    }
}
