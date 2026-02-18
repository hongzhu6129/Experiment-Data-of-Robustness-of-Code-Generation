public class SwapEquations {

    public static void main(String[] args) {
        // Example equations (represented as strings)
        String equation1 = "2x + 3y = 7";
        String equation2 = "5x - 2y = 4";

        System.out.println("Original equations:");
        System.out.println("Equation 1: " + equation1);
        System.out.println("Equation 2: " + equation2);


        // Swap the equations  (using a temporary variable)
        String temp = equation1;
        equation1 = equation2;
        equation2 = temp;

        System.out.println("\nSwapped equations:");
        System.out.println("Equation 1: " + equation1);
        System.out.println("Equation 2: " + equation2);


        // Swapping without a temporary variable (using string concatenation)
        equation1 = equation1 + ";;;" + equation2; //separator
        equation2 = equation1.substring(0, equation1.indexOf(";;;")); //extract
        equation1 = equation1.substring(equation1.indexOf(";;;") + 3);


        System.out.println("\nSwapped equations (without temp variable):");
        System.out.println("Equation 1: " + equation1);
        System.out.println("Equation 2: " + equation2);


    }
}
