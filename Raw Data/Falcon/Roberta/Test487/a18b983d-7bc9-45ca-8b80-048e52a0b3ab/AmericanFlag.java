public class AmericanFlag {

    public static void main(String[] args) {
        // Star section
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print(" ");
            for (int j = 0; j < 26; j++) {
                System.out.print("=");
            }
            System.out.println();

            if (i < 4) {
              for (int j = 0; j < 5; j++){
                System.out.print(" *");
              }
              System.out.print(" ");
              for (int j = 0; j < 26; j++) {
                System.out.print("=");
              }
              System.out.println();

            }


        }


        // Stripes section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 46; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
