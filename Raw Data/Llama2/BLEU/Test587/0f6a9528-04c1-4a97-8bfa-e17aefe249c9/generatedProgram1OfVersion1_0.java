public class CheckJavaInstallation {

    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path")); 

        // A more concise way to check (if you only care about *a* version being present):
        if (System.getProperty("java.version") != null) {
            System.out.println("\nJava appears to be installed.");
        } else {
            System.out.println("\nJava does not appear to be installed.");
        }
    }
}
