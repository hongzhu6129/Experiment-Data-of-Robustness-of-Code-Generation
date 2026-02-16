import java.util.Scanner;

public class HoneycombNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = input.nextInt();

        // A honeycomb number is of the form n^3 - (n-1)^3
        // We iterate through potential 'n' values to see if we find a match
        for (int n = 1; ; n++) {
            int honeycomb = n * n * n - (n - 1) * (n - 1) * (n - 1);
            if (honeycomb == num) {
                System.out.println("Number is a honeycomb.");
                return; // Exit after finding a match
            } else if (honeycomb > num) {
                System.out.println("Number is not a honeycomb.");
                return; // Exit if honeycomb numbers exceed input
            }
        } 
    }
}
