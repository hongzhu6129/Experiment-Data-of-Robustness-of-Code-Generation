public class CheckJavaInstallation {

    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));


        // More robust check (checks for javac):
        try {
            Process p = Runtime.getRuntime().exec("javac -version");
            int exitCode = p.waitFor();
            if (exitCode == 0) {
                System.out.println("Java Development Kit (JDK) is installed.");
            } else {
                System.err.println("Java Development Kit (JDK) might not be installed properly.  Javac returned exit code: " + exitCode);
            }
        } catch (Exception e) {
            System.err.println("Error checking for JDK: " + e.getMessage());
        }
    }
}
