import java.math.BigDecimal;

public class DoubleParts {

    public static void main(String[] args) {
        double num = 123.456;

        // Method 1: Using casting
        int wholePartCasting = (int) num;
        double fractionalPartCasting = num - wholePartCasting;

        System.out.println("Using casting:");
        System.out.println("Whole part: " + wholePartCasting);
        System.out.println("Fractional part: " + fractionalPartCasting);


        // Method 2: Using Math.floor() 
        int wholePartFloor = (int) Math.floor(num);
        double fractionalPartFloor = num - wholePartFloor;

        System.out.println("\nUsing Math.floor():");
        System.out.println("Whole part: " + wholePartFloor);
        System.out.println("Fractional part: " + fractionalPartFloor);



        // Method 3: Using BigDecimal for precise fractional part (recommended for financial calculations)
        BigDecimal bdNum = BigDecimal.valueOf(num);
        BigDecimal wholePartDecimal = bdNum.setScale(0, BigDecimal.ROUND_DOWN); // Get whole part
        BigDecimal fractionalPartDecimal = bdNum.subtract(wholePartDecimal); // Subtract whole part to get fractional part

        System.out.println("\nUsing BigDecimal:");
        System.out.println("Whole part: " + wholePartDecimal.intValue());
        System.out.println("Fractional part: " + fractionalPartDecimal.doubleValue());



        // Example with a negative number:
        double negativeNum = -987.654;

        BigDecimal bdNegativeNum = BigDecimal.valueOf(negativeNum);
        BigDecimal wholePartNegative = bdNegativeNum.setScale(0, BigDecimal.ROUND_DOWN);
        BigDecimal fractionalPartNegative = bdNegativeNum.subtract(wholePartNegative);

        System.out.println("\nExample with a negative number using BigDecimal:");
        System.out.println("Whole part: " + wholePartNegative.intValue());
        System.out.println("Fractional part: " + fractionalPartNegative.doubleValue());


    }
}
