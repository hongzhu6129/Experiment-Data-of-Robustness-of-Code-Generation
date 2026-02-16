public class CheckJavaInstallation {

    public static void main(String[] args) {
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));


        //A simpler way to just confirm the presence and general version
        String version = System.getProperty("java.version");
        System.out.println("\nSimplified Check:");
        if (version != null) {
            System.out.println("Java is installed (version " + version + ")");
        } else {
            System.out.println("Java is NOT installed.");
        }


    }
}
