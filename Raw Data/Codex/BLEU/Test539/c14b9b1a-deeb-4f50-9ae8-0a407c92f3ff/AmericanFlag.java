public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.print("==");
            for (int k = 0; k < 24; k++) {
                System.out.print("=");
            }
            System.out.println();

        }


        // Print the "pct" line (assuming this is a typo and should be part of the stripes)
        for (int j = 0; j < 4; j++) {

                System.out.print("* ");


        }
        System.out.print("==");
        for (int k = 0; k < 24; k++) {
            System.out.print("=");
        }
        System.out.println();



          // Print the striped section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 48; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

    }
}
