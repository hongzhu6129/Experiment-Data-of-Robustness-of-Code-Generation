public class AmericanFlag {

    public static void main(String[] args) {
        // Star Section
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 6; ++j) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 26; j++) {
                System.out.print("=");
            }
            System.out.println();

            if (i == 2) {  // center stripe
                System.out.print(" * * * pct * * ");
                System.out.print("==");
                for (int j = 0; j < 26; j++) {
                    System.out.print("=");
                }
                System.out.println();
                continue;  // skip regular stripe for this row.
            }

           for (int j = 0; j < 4; ++j) {
                System.out.print(" * "); // spaces added for correct alignment
            }


            System.out.print("==");
            for (int j = 0; j < 26; j++) {
                System.out.print("=");
            }
            System.out.println();

        }


        // Stripes Section
        for (int i = 0; i < 6; ++i) {
            System.out.print("==");
            for (int j = 0; j < 46; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
