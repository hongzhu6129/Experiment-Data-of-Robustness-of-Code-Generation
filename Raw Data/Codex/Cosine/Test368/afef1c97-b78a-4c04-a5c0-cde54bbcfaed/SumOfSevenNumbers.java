public class SumOfSevenNumbers {

    public static void main(String[] args) {
        // Test data provided: 74 + 36 = 110. We'll use these and five more numbers.
        int num1 = 74;
        int num2 = 36;
        int num3 = 10;
        int num4 = 25;
        int num5 = 5;
        int num6 = 12;
        int num7 = 8;

        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7;

        System.out.println("The sum of the seven numbers is: " + sum);


        // Alternatively, to make it more dynamic (though the question specifies seven specific numbers): you could accept command line arguments

         /* if (args.length == 7) {  //Check if exactly 7 arguments are provided.
            int sumFromArgs = 0;
            try {
                for (String arg : args) {
                    sumFromArgs += Integer.parseInt(arg); //Convert string arguments to integers and sum.
                }
                System.out.println("Sum from command-line arguments: " + sumFromArgs);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: Please provide seven integer arguments.");
            }
        } else {
            System.err.println("Please provide exactly seven numbers as command-line arguments.");
        }*/
    }
}
