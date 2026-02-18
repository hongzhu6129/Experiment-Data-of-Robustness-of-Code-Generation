public class CompareDoubles {

    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 10.5;
        double num3 = 10.500000000000001; // A very slightly different value
        double num4 = 10.6;


        System.out.println(num1 + " and " + num2 + " are equal: " + (num1 == num2)); // Correct comparison for simple cases

        System.out.println(num1 + " and " + num3 + " are equal: " + (num1 == num3));  // May give unexpected results due to floating-point imprecision

        System.out.println(num1 + " and " + num4 + " are equal: " + (num1 == num4));

        //  More Robust Comparison Using Double.compare or Math.abs:

        System.out.println(num1 + " and " + num3 + " are equal (using Double.compare): " + (Double.compare(num1, num3) == 0));
        System.out.println(num1 + " and " + num3 + " are very close (using Math.abs): " + (Math.abs(num1 - num3) < 1e-10) ); //Check if the difference is very small



        // Example with NaN (Not a Number) and Infinity

        double nanValue = Double.NaN;
        double infinityValue = Double.POSITIVE_INFINITY;

        System.out.println(nanValue + " and " + nanValue + " are equal: " + (nanValue == nanValue)); // NaN is never equal to itself � use Double.isNaN()!
        System.out.println(nanValue + " is NaN: " + Double.isNaN(nanValue)); // Correct way to check for NaN


        System.out.println(infinityValue + " and " + infinityValue + " are equal: " + (infinityValue == infinityValue)); // Infinity comparisons can work as expected.




    }
}
