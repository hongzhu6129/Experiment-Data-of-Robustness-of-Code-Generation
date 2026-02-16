public class Pattern {

    public static void main(String[] args) {
        System.out.println("j    a    v     v    a");
        System.out.println("j   a a    v   v    a a");
        System.out.println("j  a   a    v v    a   a");
        System.out.println("j aaaaa    v    v  aaaaa");
        System.out.println("jj a   a   v    v a     a");
        System.out.println(" j a   a   v    v a     a");
       
        /* Alternative using formatted output for better alignment
         *  but may be harder to visually edit small changes
         *
         * System.out.printf("%s %4s %4s %4s %4s\n", "j", "a", "v", "v", "a");
         * System.out.printf("%s %4s %4s %4s %6s\n", "j", "a a", "v   v", "a a");
         * System.out.printf("%s %4s %4s %4s %6s\n", "j", "a   a", "v v", "a   a");
         * System.out.printf("%s %4s %4s %4s %6s\n", "j", "aaaaa", "v    v", "aaaaa");
         * System.out.printf("%2s %4s %4s %4s %8s\n", "jj", "a   a", "v    v", "a     a");
         * System.out.printf("%2s %4s %4s %4s %8s\n", " j", "a   a", "v    v", "a     a");
         */
    }
}
