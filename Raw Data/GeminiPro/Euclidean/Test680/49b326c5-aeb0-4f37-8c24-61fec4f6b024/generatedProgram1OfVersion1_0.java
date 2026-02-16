public class RoundUpIntegerDivision {

    public static void main(String[] args) {

        int numerator = 17;
        int denominator = 5;

        // Method 1: Using Math.ceil() (Cast to double for accurate results)
        int result1 = (int) Math.ceil((double) numerator / denominator);
        System.out.println("Result using Math.ceil(): " + result1);

        // Method 2:  Integer arithmetic (adjusting the numerator before division)
        int result2 = (numerator + denominator - 1) / denominator;
        System.out.println("Result using integer arithmetic: " + result2);


        //More examples
        System.out.println("7/3 rounded up: " + roundUp(7, 3));
        System.out.println("10/2 rounded up: " + roundUp(10,2));
        System.out.println("1/5 rounded up: " + roundUp(1,5));

    }

    //Helper function for clarity (Not necessary, but good practice for reusable logic)
    public static int roundUp(int numerator, int denominator) {
        return (numerator + denominator - 1) / denominator;
    }
}
