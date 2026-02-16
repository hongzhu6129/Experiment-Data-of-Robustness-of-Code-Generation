public class ReverseInteger {

    public static void main(String[] args) {
        int num = 12345;
        int reversed = 0;

        System.out.println("Original Number: " + num);

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);


        //Handling overflow (though not explicitly requested, it's good practice)
        num = 1534236469;  //Example that would overflow
        reversed = 0;

        System.out.println("\nOriginal Number (with potential overflow): " + num);

        try {
            while (num != 0) {
                int digit = num % 10;
                reversed = Math.addExact(Math.multiplyExact(reversed, 10), digit); //Use Math.addExact and Math.multiplyExact to detect overflow
                num /= 10;
            }
            System.out.println("Reversed Number: " + reversed);

        } catch (ArithmeticException e) {
            System.out.println("Integer overflow occurred during reversal.");
        }




    }
}
