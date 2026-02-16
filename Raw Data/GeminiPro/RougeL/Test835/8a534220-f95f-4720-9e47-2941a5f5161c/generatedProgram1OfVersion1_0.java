public class AmericanFlag {

    public static void main(String[] args) {
        // Print the star field
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            if(i==2) {
                System.out.print("pct ");
            }
            System.out.print("==================================");
            System.out.println();
        }

        // Print the stripes
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }

             System.out.print("==================================");
            System.out.println();
        }




         for (int i = 0; i < 6; i++) {
            System.out.print("==================================");
            System.out.println();
        }
    }
}
