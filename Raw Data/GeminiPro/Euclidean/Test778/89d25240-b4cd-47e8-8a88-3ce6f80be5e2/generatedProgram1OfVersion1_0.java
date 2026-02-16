public class AmericanFlag {

    public static void main(String[] args) {
        // Stripes and stars section
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 6; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("==");
            for (int j = 0; j < 26; j++) {
                System.out.print("=");
            }
            System.out.println();
        }

        if(args.length > 0 && args[0].equals("pct")){ // Added conditional for the "pct" argument
            System.out.print("* * * * * pct ");
        } else {
            System.out.print("* * * * * ");
        }
            
            
        System.out.print("==");
        for (int j = 0; j < 26; j++) {
            System.out.print("=");
        }
        System.out.println();


        // Red stripes section
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 32; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
