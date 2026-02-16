public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 2 && j == 4) {
                  System.out.print("pct ");
                } else {
                  System.out.print("* ");
                }
            }
            System.out.print("==");
            for (int k = 0; k < 26; k++) {
                System.out.print("=");
            }
            System.out.println(); // New line after each row
        }
          for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
               System.out.print("* ");
            }
            System.out.print("==");
            for (int k = 0; k < 26; k++) {
                System.out.print("=");
            }
            System.out.println(); // New line after each row
        }

        // Print the striped section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 38; j++) {
                System.out.print("=");
            }
            System.out.println(); // New line after each row
        }
    }
}
