public class AmericanFlag {

    public static void main(String[] args) {
        // Stripes and Stars section
        for (int i = 0; i < 9; i++) {
            // Stars Section (only on odd rows)
            if (i % 2 == 0) {
                for (int j = 0; j < 6; j++) {
                    System.out.print("* ");
                }
                System.out.print("  ");
            }


            // Stripes section (all rows)
            System.out.print("==");
            for (int k = 0; k < 30; k++){
                System.out.print("=");
            }
            System.out.println();

        }


        // Only Stripes Section
        for(int i = 0; i < 6; i++){
            System.out.print("==");
            for (int k = 0; k < 30; k++){
                System.out.print("=");
            }
            System.out.println();

        }
    }
}
