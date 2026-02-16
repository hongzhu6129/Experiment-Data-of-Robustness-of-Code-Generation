public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }
            System.out.print(" ");
            for (int j = 0; j < 26; j++) {
                System.out.print("=");
            }
            System.out.println(); // New line after each row
        }

        // Print the striped section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 46; j++) {
                System.out.print("=");
            }
            System.out.println(); // New line after each row
        }
    }
}
