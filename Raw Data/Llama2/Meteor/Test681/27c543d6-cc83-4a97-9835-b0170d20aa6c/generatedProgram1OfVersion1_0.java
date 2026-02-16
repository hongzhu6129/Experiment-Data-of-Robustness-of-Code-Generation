public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 9; i++) {
            // Print the stars
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    if (j < 2) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                     System.out.print("* ");

                }

            }
            // Print the stripes
             System.out.print("==");
             for(int k = 0; k< 22; k++) {
                 System.out.print("=");
             }

            System.out.println(); // Newline
        }



        // Print the striped section
        for (int i = 0; i < 6; i++) {
            //Print the stripe lines
            for(int k=0; k<46;k++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
