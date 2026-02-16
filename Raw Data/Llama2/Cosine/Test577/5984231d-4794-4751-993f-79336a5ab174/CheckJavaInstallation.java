public class CheckJavaInstallation {

    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path")); 

        // You can add a simple check here based on the expected output. For example:
        String javaVersion = System.getProperty("java.version");
        if (javaVersion.startsWith("1.8.0")) { // Check if Java 8 is installed (adjust as needed)
            System.out.println("Java 8 (or a compatible version) appears to be installed.");
        } else {
            System.out.println("Java 8 (or a compatible version) might not be installed. Please verify.");
        }
    }
}
