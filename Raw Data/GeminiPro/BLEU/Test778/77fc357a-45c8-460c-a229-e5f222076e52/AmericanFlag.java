public class AmericanFlag {

    public static void main(String[] args) {
        // Print the stars and stripes section
        for (int i = 0; i < 5; i++) {
            // Stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces after stars
            for (int j = 0; j < 5 - i - 1; j++) {
                if (i==2 && j==1) {
                  System.out.print("pct ");
                }
                else{
                 System.out.print("  ");
                }
            }



            // Stripes
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
        }



         for (int i = 0; i < 4; i++) {
            // Stars
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }



            // Stripes
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

        // Print the red stripes section
        for (int i = 0; i < 6; i++) {
            System.out.print("=="); // Start with ==
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }

            System.out.println();
        }
    }
}
