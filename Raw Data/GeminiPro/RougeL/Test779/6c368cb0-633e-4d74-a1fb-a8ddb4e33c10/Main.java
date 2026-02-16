public class Main {
    public static void main(String[] args) {
        // Swapping two "equations" (represented as strings)
        String equation1 = "x + y = 5";
        String equation2 = "2x - y = 3";

        System.out.println("Original equations:");
        System.out.println("Equation 1: " + equation1);
        System.out.println("Equation 2: " + equation2);

        String temp = equation1;
        equation1 = equation2;
        equation2 = temp;


        System.out.println("\nSwapped equations:");
        System.out.println("Equation 1: " + equation1);
        System.out.println("Equation 2: " + equation2);



        // Printing a face
        System.out.println("\nPrinting a face:");
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");

    }
}
