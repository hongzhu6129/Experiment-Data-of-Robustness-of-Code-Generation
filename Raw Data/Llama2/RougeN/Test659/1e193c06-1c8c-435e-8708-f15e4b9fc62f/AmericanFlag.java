public class AmericanFlag {

    public static void main(String[] args) {
        // Print the top striped section of the flag
        for (int i = 0; i < 5; i++) {
            // Print stars
            if (i % 2 == 0) {
                System.out.print("* * * * * * ");
            } else {
                System.out.print("* * * * * ");
            }

            // Print stripes
            System.out.println("==================================");
        }


        // Print the "pct" section - intentionally left as it is in the prompt
        System.out.println("* pct * * * * ==================================");

         //Continue stripes for the remaining rows
         for (int i = 0; i < 4; i++) {
            // Print stars
            if (i % 2 == 0) {
                System.out.print("* * * * * * ");
            } else {
                System.out.print("* * * * * ");
            }

            // Print stripes
            System.out.println("==================================");
        }
        

        // Print the bottom red stripes
        for (int i = 0; i < 6; i++) {
            System.out.println("==============================================");
        }
    }
}
