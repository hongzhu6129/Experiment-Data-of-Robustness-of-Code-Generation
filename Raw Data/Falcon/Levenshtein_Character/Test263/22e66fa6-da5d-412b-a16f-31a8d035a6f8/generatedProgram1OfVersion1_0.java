public class JavaPattern {

    public static void main(String[] args) {
        System.out.println("j    a   v     v  a");
        System.out.println("j   a a   v     v a a");
        System.out.println("j  a   a  v     v a   a");
        System.out.println("jj aaaaa   v   v aaaaa");
        System.out.println(" jj a   a   v v  a   a");
        System.out.println("j a   a    v   a   a");

        // Alternative approach using formatted strings for better alignment:
        // Requires Java 15+ for formatted strings with this many parameters.
        /* 
        System.out.println(String.format("%s %s %s %s %s", "j", "a", "v     v", "a", ""));
        System.out.println(String.format("%s %s %s %s %s", "j", "a a", "v     v", "a a", ""));
        System.out.println(String.format("%s %s %s %s %s", "j", "a   a", "v     v", "a   a", ""));
        System.out.println(String.format("%s %s %s %s %s", "jj", "aaaaa", "v   v", "aaaaa", ""));
        System.out.println(String.format("%s %s %s %s %s", " jj", "a   a", "v v", "a   a", ""));
        System.out.println(String.format("%s %s %s %s %s", "j", "a   a", "v", "a   a", "")); 
        */

        //OR Using printf (older Java versions)
        /*
        System.out.printf("%s %3s %6s %3s\n","j", "a", "v     v", "a");
        System.out.printf("%s %3s %6s %3s\n","j", "a a", "v     v", "a a");
        System.out.printf("%s %5s %6s %5s\n","j", "a   a", "v     v", "a   a");
        System.out.printf("%2s %5s %4s %5s\n","jj", "aaaaa", "v   v", "aaaaa");
        System.out.printf("%3s %5s %2s %5s\n"," jj", "a   a", "v v", "a   a");
        System.out.printf("%s %5s %s %5s\n","j", "a   a", "v", "a   a");
        */
    }
}
