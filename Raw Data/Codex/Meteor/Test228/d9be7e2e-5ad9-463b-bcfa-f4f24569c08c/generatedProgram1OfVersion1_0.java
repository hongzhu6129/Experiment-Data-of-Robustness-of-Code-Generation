public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 6; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    if (j < 5) {
                        System.out.print("* ");
                    }
                }
            }

            // Print the stripes
            System.out.print("==");
            for (int k = 0; k < 18; k++) {
                System.out.print("=");
            }
            System.out.println();
        }

           // Print "pct" on the 7th line. Centered below the stars
        System.out.print("     pct     "); // Adjust spacing as needed
        System.out.print("==");
        for (int k = 0; k < 18; k++) {
            System.out.print("=");
        }
        System.out.println();



        for (int i = 0; i < 2; i++) { // Remaining two rows of stars
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }

            System.out.print("=="); // And their stripes

            for (int k = 0; k < 18; k++) {
                System.out.print("=");
            }

            System.out.println();
        }





        // Print the striped section
        for (int i = 0; i < 6; i++) {
            System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
