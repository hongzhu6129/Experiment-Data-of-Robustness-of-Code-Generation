public class AmericanFlag {

    public static void main(String[] args) {
        // Star section
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            if (i == 2) {
                System.out.print("pct "); // Placeholder, as "pct" isn't standard flag element
            }
            System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();
        }


        // Stripes section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print("=");
            }
            System.out.println();

        }
    }
}
