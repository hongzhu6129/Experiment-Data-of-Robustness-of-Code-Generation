public class AmericanFlag {

    public static void main(String[] args) {
        // Print the flag pattern
        for (int i = 0; i < 5; i++) {
            // Stars and Stripes rows alternate
            if (i % 2 == 0) { // Even row: * * * * * * ===============
                for (int j = 0; j < 6; j++) {
                    System.out.print("* ");
                }
                System.out.print(" ================================");
            } else { // Odd row: * * * * * ===============
                for (int j = 0; j < 5; j++) {
                    System.out.print("* ");
                }
                System.out.print(" ================================");
            }
            System.out.println(); // Newline after each row
        }

        // Middle row with "pct"
        for (int j = 0; j < 4; j++) {
            System.out.print("* ");
        }
        System.out.print("pct "); // Replace "pct" with any desired three-character string
        for (int j = 0; j < 1; j++) {
            System.out.print("* ");
        }
        System.out.print(" ================================");
        System.out.println(); // Newline after the middle row

        for (int i = 0; i < 4; i++) {
            // Stars and Stripes rows alternate (similar to the top section)
            if (i % 2 == 0) {
                for (int j = 0; j < 6; j++) {
                    System.out.print("* ");
                }
                System.out.print(" ================================");

            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.print("* ");
                }
                System.out.print(" ================================");
            }
            System.out.println();
        }


        // Print the stripes section
        for (int i = 0; i < 6; i++) {
            System.out.print("===============================================");
            System.out.println();
        }


    }
}

