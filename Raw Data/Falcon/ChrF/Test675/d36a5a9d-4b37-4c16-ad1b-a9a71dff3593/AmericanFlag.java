public class AmericanFlag {

    public static void main(String[] args) {
        // Print the flag pattern
        for (int i = 0; i < 5; i++) {
            // Stars and Stripes section
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" ==================================");
            System.out.println();


            if (i == 3) {
                 for (int j = 0; j < 3; j++) {
                    System.out.print("* ");
                }
                System.out.print(" pct "); // Example different character
                for (int j = 0; j < 2; j++){
                    System.out.print("* ");
                }

                System.out.print(" ==================================");
                System.out.println();


            } else {
               for (int j = 0; j < 5; j++) {
                    System.out.print("* ");
                }
                 System.out.print(" ==================================");
                 System.out.println();

             }



        }


        for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 5; j++) {
                    System.out.print("* ");
                }
                 System.out.print(" ==================================");
                 System.out.println();

        }

        // Stripes only section
        for (int i = 0; i < 6; i++) {
            System.out.print("==============================================");
            System.out.println();
        }
    }
}
