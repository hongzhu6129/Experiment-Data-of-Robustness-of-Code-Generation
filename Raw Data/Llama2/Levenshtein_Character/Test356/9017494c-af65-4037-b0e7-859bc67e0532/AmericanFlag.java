public class AmericanFlag {

    public static void main(String[] args) {
        // Star Section
        for (int i = 0; i < 6; i++) {
            // Print stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" "); // Space between stars and stripes
            
            // Print Stripes
            System.out.print("==");
            for (int j = 0; j < 32; j++) {
                System.out.print("=");
            }
            System.out.println(); // New line
        }

        //Print "pct" section (this is unusual for a flag but included as per the example)
        for (int i = 0; i < 1; i++) {
             for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" ");
            System.out.print("pct ");
            for (int j = 0; j < 32; j++) {
                System.out.print("=");
            }

            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" ");
            for (int j = 0; j < 32; j++) {
                System.out.print("=");
            }

            System.out.println();
        }
        

        // Stripes Section
        for (int i = 0; i < 6; i++) {
            // Just stripes, no stars
            System.out.print("==");
            for (int j = 0; j < 32; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

    }
}
