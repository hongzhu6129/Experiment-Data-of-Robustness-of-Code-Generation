public class SumOfSeven {

    public static void main(String[] args) {
        // Test data:  74 + 36 + ... (we need 7 numbers)
        int num1 = 74;
        int num2 = 36;
        int num3 = 12;
        int num4 = 5;
        int num5 = 8;
        int num6 = 20;
        int num7 = 3;

        int sum = num1 + num2 + num3 + num4 + num5 + num6 + num7;

        System.out.println(sum); // Output: 158 (with these example numbers)


        //Alternatively, you can take command line arguments:
        if (args.length == 7) {
            try {
                int sumFromArgs = 0;
                for (String arg : args) {
                    sumFromArgs += Integer.parseInt(arg);  // Convert string arguments to integers
                }
                System.out.println(sumFromArgs);
            } catch (NumberFormatException e) {
                System.err.println("Invalid input: Please provide 7 integer arguments.");
            }
        } else {
            System.out.println("Please provide seven numbers as command line arguments.");

        }



    }
}
