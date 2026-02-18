public class CheckJavaInstallation {

    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));

        // More robust check (checks if java command is available in the system path)
        try {
            Process p = Runtime.getRuntime().exec("java -version");
            int exitCode = p.waitFor();
            if (exitCode == 0) {
                System.out.println("\nJava is installed and accessible in the system path.");
            } else {
                System.err.println("\nJava might not be installed correctly or accessible in the system path.  Exit code: " + exitCode); // Added error stream for clearer output
            }
        } catch (Exception e) {
            System.err.println("\nError checking Java installation: " + e.getMessage()); // Added error stream and more informative error message
        }
    }
}
