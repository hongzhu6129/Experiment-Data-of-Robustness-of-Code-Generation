public class CheckJavaInstallation {

    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));


        // A more robust check (in addition to printing the properties):
        try {
            // Try executing a simple Java command.  If Java isn't installed
            // or configured correctly, this will throw an exception.
            Runtime.getRuntime().exec("java -version"); 
            System.out.println("\nJava appears to be installed and configured correctly.");

        } catch (Exception e) {
            System.err.println("\nError checking Java installation: " + e.getMessage());
            System.err.println("Java might not be installed or properly configured in your environment variables (PATH).");

        }

    }
}
