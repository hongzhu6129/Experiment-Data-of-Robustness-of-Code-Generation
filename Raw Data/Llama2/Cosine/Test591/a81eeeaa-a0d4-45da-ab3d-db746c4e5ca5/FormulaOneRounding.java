import java.math.BigDecimal;
import java.math.RoundingMode;

public class FormulaOneRounding {

    public static void main(String[] args) {
        // Example usage:
        double result1 = 3.14159;
        double result2 = 2.71828;
        double result3 = 1.61803;
        double result4 = 10.0/3.0; // Results in repeating decimal

        System.out.println(roundUp(result1)); // Output: 4.0
        System.out.println(roundUp(result2)); // Output: 3.0
        System.out.println(roundUp(result3)); // Output: 2.0
        System.out.println(roundUp(result4)); // Output: 4.0



       //Demonstrates handling possible NumberFormatException
        try {
             double result5 = Double.parseDouble(args[0]);
            System.out.println(roundUp(result5));
        }catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid input or no input provided. Using default value.");
             double result5 = 2.5;
            System.out.println(roundUp(result5)); // Output 3.0


        }

    }

    private static double roundUp(double value) {
        // Using BigDecimal for accurate rounding:
        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(0, RoundingMode.UP); // Round up to 0 decimal places
        return bd.doubleValue();

        // Alternatively, using Math.ceil():
        // return Math.ceil(value); 
    }
}
