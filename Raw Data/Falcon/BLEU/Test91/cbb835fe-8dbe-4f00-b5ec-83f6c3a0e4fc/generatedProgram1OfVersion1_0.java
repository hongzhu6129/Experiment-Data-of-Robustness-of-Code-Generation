public class AmericanFlag {

    public static void main(String[] args) {
        // Print the striped section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 26; j++) {
                System.out.print("=");
            }
            System.out.println();

             if (i < 5) {
                 for (int j = 0; j < 4; j++) {
                     System.out.print("  * ");
                 }
                 System.out.print("==");
                for (int j = 0; j < 26; j++) {
                    System.out.print("=");
                }
                System.out.println();

             }

        }
    


        // Print the solid red section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 34; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
