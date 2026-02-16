public class AmericanFlag {

    public static void main(String[] args) {
        // Stripes and canton section
        for (int i = 0; i < 5; i++) {
            // Canton (stars and blue background represented by "*")
            System.out.print("* * * * * "); 

            // Gap
            System.out.print("==");

            // Rest of the stripe (red, represented by "=")
            System.out.println("==================================");

            System.out.print("* * * * * * "); // Next stripe offset

            // Gap
            System.out.print("==");

            // Rest of the stripe
            System.out.println("==================================");
        }


        // Remaining 4 stripes
         for (int i = 0; i < 4; i++) {
             // Entire stripe (red, represented by "=")
             System.out.println("============================================");
         }
    }
}
