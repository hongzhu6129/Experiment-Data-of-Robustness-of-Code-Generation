import java.lang.Math;

public class FloorLog2 {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an integer argument.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);

            if (n <= 0) {
                System.out.println("Input must be a positive integer.");
                return;
            }

            int result = (int) Math.floor(Math.log(n) / Math.log(2));
            System.out.println(result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide an integer.");
        }
    }
}
