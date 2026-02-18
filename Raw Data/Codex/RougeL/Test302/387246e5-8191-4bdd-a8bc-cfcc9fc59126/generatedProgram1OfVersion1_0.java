public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section
        for (int i = 0; i < 6; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" =================================\n");

            // Print the stripes (alternating rows)
            if (i % 2 == 1) {
               
                System.out.print(" "); // offset for the stripe rows
                 for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
                System.out.print(" =================================\n");
            }
        }

        // Print the three remaining star rows (if you want all 9 rows to have stars initially as the prompt implies)

         for (int i = 0; i < 3; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" =================================\n");
        }

        // Print the red stripes
        for (int i = 0; i < 6; i++) {
            System.out.println("==================================");
        }
    }
}
