import java.lang.Math;

public class FloorLog2 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java FloorLog2 <integer>");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);

            if (n <= 0) {
                System.err.println("Input must be a positive integer.");
                return;
            }

            int result = (int) (Math.floor(Math.log(n) / Math.log(2)));
            System.out.println(result);


        } catch (NumberFormatException e) {
            System.err.println("Invalid input: " + args[0] + " is not an integer.");
        }
    }
}
