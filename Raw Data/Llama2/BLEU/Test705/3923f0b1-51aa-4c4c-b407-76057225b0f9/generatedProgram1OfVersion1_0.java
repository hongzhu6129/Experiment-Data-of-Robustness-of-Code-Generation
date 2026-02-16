public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section of the flag
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

        // Print the 7th row (slightly different)
        for (int j = 0; j < 4; j++) {
             System.out.print("* ");
         }
         System.out.print("pct ");  // Added "pct" as per the example
         for (int j = 0; j < 20; j++) {
            System.out.print("=");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("=="); // maintain double equals for alignment
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }

            System.out.println();
        }



        // Print the striped section of the flag
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 28; k++) {  //Consistent with upper section
                System.out.print("=");
            }
            System.out.println();
        }

    }
}
