import java.lang.Math;

public class FloorLog2 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FloorLog2 <integer>");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);

            if (n <= 0) {
                System.out.println("Input must be a positive integer.");
            } else {
                int result = (int) (Math.log(n) / Math.log(2)); 
                System.out.println(result);
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
