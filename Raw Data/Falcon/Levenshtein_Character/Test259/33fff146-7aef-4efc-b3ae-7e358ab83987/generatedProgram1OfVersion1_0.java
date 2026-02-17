public class AmericanFlag {

    public static void main(String[] args) {
        // Print the top "star" section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            if(i == 2) {
                System.out.print("pct "); // Adding "pct" as per the prompt
            }
            System.out.print("==================================");
            System.out.println();
        }

        // Print the bottom "stripe" section
        for (int i = 0; i < 6; i++) {
            System.out.println("============================================");
        }
    }
}
