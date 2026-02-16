public class Main {
    public static void main(String[] args) {
        System.out.println("a    a^2   a^3   a^4");
        System.out.println("1    1     1     1");
        System.out.println("2    4     8     16");
        System.out.println("3    9     27    81");
        System.out.println("4    16    64    256");

        // Alternatively, using a loop (more efficient for larger tables):
        //System.out.println("a\ta^2\ta^3\ta^4"); // Using tabs for alignment
        //for (int a = 1; a <= 4; a++) {
        //    System.out.println(a + "\t" + (int)Math.pow(a, 2) + "\t" + (int)Math.pow(a, 3) + "\t" + (int)Math.pow(a, 4)); 
        //}

    }
}
