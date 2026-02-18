public class RoundUpIntegerDivision {

    public static void main(String[] args) {
        int numerator = 7;
        int denominator = 3;

        int result = (int) Math.ceil((double) numerator / denominator);

        System.out.println("Rounded up result: " + result);


        //Example with negative numbers (be careful with Math.ceil for negative results)
        numerator = -7;
        denominator = 3;

        result = (int) Math.ceil((double) numerator / denominator); // This will give -2 which might not be what you expect


        int roundedUpNegative = - (int) Math.floor( (double) -numerator / denominator); // This rounds towards zero

        System.out.println("Rounded up (towards zero) result for negative numbers: " + roundedUpNegative);



        //More generalized solution that handles negatives correctly:
        int generalRoundedUp =  (numerator + denominator -1)/ denominator ;

         numerator = -7;
         denominator = 3;
        System.out.println("Generalized rounded up result: " + (numerator + denominator - 1) / denominator );


        numerator = 7;
        denominator = 3;
        System.out.println("Generalized rounded up result: " + (numerator + denominator - 1) / denominator );


    }
}
