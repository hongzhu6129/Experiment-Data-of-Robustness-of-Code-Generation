public class Pattern {

    public static void main(String[] args) {
        System.out.println("j   a   v     v   a");
        System.out.println("j  a a   v   v  a a");
        System.out.println("j aaaa   v v   aaaa");
        System.out.println("jj a a   v   a a");
        System.out.println("j a   a v     a   a");

        System.out.println(""); // Empty line for clearer separation

        // Alternative approach using formatted strings (more flexible):
        String format = "%s %3s %s %5s %3s\n";
        System.out.printf(format, "j",   "a",   "v",     "v",   "a");
        System.out.printf(format, "j",  "a a",   "v",   "v",  "a a");
        System.out.printf(format, "j", "aaaa",   "v v",   "", "aaaa"); // Adjusted spacing slightly
        System.out.printf(format, "jj", "a a",   "v",   "", "a a");  // Adjusted spacing slightly
        System.out.printf(format, "j", "a   a", "v",     "", "a   a"); // Adjusted spacing slightly


        System.out.println(""); // Empty line for clearer separation


        // Most accurate representation of the desired output (no extra space at the end):

        System.out.print("j   a   v     v   a\n");
        System.out.print("j  a a   v   v  a a\n");
        System.out.print("j aaaa   v v   aaaa\n");
        System.out.print("jj a a   v   a a\n");
        System.out.print("j a   a v     a   a\n");



    }
}
