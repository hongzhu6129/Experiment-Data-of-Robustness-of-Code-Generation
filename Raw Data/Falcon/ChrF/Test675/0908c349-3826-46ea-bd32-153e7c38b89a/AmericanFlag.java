public class AmericanFlag {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("pct "); // Added "pct" as per the example
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();
        }



        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 25; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
