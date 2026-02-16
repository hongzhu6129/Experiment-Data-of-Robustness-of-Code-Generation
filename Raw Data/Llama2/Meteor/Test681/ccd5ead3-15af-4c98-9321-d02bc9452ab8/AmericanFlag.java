public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("==");
            for (int k = 0; k < 26; k++) {
                System.out.print("=");
            }
            System.out.println();
        }


        //Print the solid red section.  The "pct" in the prompt was assumed to be a typo.

        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 46; k++) {
                System.out.print("=");
            }
            System.out.println();

        }
    }
}
