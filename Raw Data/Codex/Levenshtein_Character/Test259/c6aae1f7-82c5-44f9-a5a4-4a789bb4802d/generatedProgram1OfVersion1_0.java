public class AmericanFlag {

    public static void main(String[] args) {
        // Print the top part of the flag (stars and stripes)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 26; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

        // Print the stripes-only section
         for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 1 && j == 2) {
                   System.out.print("pct ");
                } else {
                   System.out.print("* "); 
                }
            }
            System.out.print("==");
            for (int j = 0; j < 26; j++) {
                System.out.print("=");
            }
            System.out.println();
        }


        for (int i = 0; i < 6; i++) {
            System.out.print("==");
            for (int j = 0; j < 32; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
