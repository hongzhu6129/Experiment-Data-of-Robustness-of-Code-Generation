public class AmericanFlag {

    public static void main(String[] args) {
        // Stripes and stars section
        for (int i = 0; i < 6; i++) {
            // Stars
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            // Gap
            System.out.print(" ");

            // Pct (placeholder for canton)
            if (i % 2 == 0) {
                System.out.print("pct");
            } else {
                System.out.print("   ");
            }


            System.out.print(" ");

            // Separator
            System.out.println("==================================");
        }



        // Remaining stripes
        for (int i = 0; i < 4; i++){
             System.out.println("============================================");
        }
    }
}
