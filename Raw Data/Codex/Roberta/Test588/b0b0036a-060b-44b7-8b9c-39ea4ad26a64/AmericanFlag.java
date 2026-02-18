public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 9; i++) {
            // Print stars
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0 && j == 5) {
                    System.out.print("  ");
                } else {
                   System.out.print("* ");
                }

            }
           
            //Print the stripes
            System.out.print("==");
            for (int k = 0; k < 26; k++) {
                System.out.print("=");
            }
            System.out.println();
        }

        // Print the striped section
        for (int i = 0; i < 6; i++) {
            System.out.print("=="); // Align with above stripes

            // Print the rest of the stripe
            for (int k = 0; k < 26; k++) {
                System.out.print("=");
            }

            System.out.println();
        }

    }
}

