public class CheckJavaInstallation {

    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));


        // A more concise way to check if Java is installed would be to simply
        // try to execute some Java code.  If the JVM isn't available, the program 
        // won't run.  The above provides more details if it *is* installed.

        System.out.println("\nIf you see the above output, Java is installed and working.");
    }
}
