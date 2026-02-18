public class AmericanFlag {

    public static void main(String[] args) {
        // Print the starred section
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();


            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
             System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();



        }

         for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
             System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();



            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
             System.out.print("==");
            for (int j = 0; j < 18; j++) {
                System.out.print("=");
            }
            System.out.println();



        // Print the striped section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 26; j++) { // Adjusted to total 26 = signs
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
