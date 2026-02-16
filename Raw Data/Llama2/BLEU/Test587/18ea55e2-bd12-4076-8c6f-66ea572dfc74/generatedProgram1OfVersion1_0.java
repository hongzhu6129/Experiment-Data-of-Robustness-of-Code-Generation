public class CheckJavaInstallation {

    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path")); 

        // A more concise way to check (if you just want to know IF it's installed):
        if (System.getProperty("java.version") != null) {
            System.out.println("\nJava is installed on this system.");
        } else {
            System.out.println("\nJava is NOT installed on this system."); // Highly unlikely to reach here if the code runs at all.
        }
    }
}
