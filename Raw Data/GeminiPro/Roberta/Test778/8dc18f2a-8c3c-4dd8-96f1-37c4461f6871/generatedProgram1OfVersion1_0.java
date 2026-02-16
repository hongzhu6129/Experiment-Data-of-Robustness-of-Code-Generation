public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println("* * * * * * ==================================");
            } else {
                System.out.println(" * * * * * ==================================");
            }
        }
         System.out.println("* * * * * pct ==================================");
         for (int i = 0; i < 4; i++) {
            if (i % 2 == 1) {
                System.out.println("* * * * * * ==================================");
            } else {
                System.out.println(" * * * * * ==================================");
            }
        }


        // Print the striped section
        for (int i = 0; i < 6; i++) {
            System.out.println("==============================================");
        }
    }
}
