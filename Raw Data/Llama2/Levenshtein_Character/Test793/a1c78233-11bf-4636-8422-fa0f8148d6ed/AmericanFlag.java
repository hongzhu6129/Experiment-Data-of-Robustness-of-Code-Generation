public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section of the flag
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

         // Print the 7th stripe, slightly different
        for (int j = 0; j < 6; j++) {
            System.out.print("* ");
        }
        System.out.print("pct "); // Added "pct" as per the example
        for (int j = 0; j < 18; j++) {
            System.out.print("=");
        }
        System.out.println();



        // Print the next 2 rows with stars 
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();
        }



        // Print the solid red section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 26; j++) { // Adjusted to match output
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
