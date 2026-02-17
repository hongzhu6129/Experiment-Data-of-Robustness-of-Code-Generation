public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section
        for (int i = 0; i < 6; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" =================================\n");

            // Print the red stripe
            if (i < 5) {
              for (int j = 0; j < 6; j++) {
                  System.out.print("* ");
              }
              System.out.print(" =================================\n");
            }

         }

        //Print the canton (blue area with stars - simplified)
        System.out.print(" * * * pct =================================\n");


        // Print the bottom red stripes
        for (int i = 0; i < 6; i++) {
            System.out.print("==============================================\n");
        }
    }
}
