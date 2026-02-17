public class AmericanFlag {

    public static void main(String[] args) {
        // Print the top part of the flag (stars and stripes)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            if (i == 2) {
                 System.out.print("pct "); // Placeholder for canton design. Replace "pct" with actual star printing if needed
            }
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();


            for (int j = 0; j < 4; j++) {
                System.out.print("* ");

             }
            System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }


            System.out.println();
        }
         for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
             System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
              for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
             System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }
            System.out.println();
              for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
             System.out.print("==");
            for (int j = 0; j < 20; j++) {
                System.out.print("=");
            }

            System.out.println();


        // Print the bottom part of the flag (red stripes)
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
