import java.util.Map;
import java.util.Properties;

public class SystemProperties {

    public static void main(String[] args) {

        // Get system properties
        Properties systemProperties = System.getProperties();

        // Print system properties
        System.out.println("System Properties:");
        for (Map.Entry<Object, Object> entry : systemProperties.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        // There's no standard, direct way to get "sustainable" system properties in Java. 
        //  The concept of "sustainable" properties isn't a built-in aspect of the Java system properties.
        // "Sustainable" usually refers to power management or resource usage, which are OS-specific.
        //  You would need to use platform-specific code (e.g., JNI, JNA, or external libraries) to access such information.


        // Example (conceptual - requires external libraries/OS-specific code):
        // If you were interested in battery life (one aspect of "sustainability" related to power):
        //  You could use a library to interact with the OS power management APIs and then print that info.
        System.out.println("\nIllustrative Example (Conceptual - no standard Java API for this):");


       try {
           if (System.getProperty("os.name").toLowerCase().contains("win")) {
                // Placeholder - Windows-specific code would go here using something like JNA to call power profile APIs 
               System.out.println("Example: Getting battery status on Windows (using external libraries not shown here).");
            } else if (System.getProperty("os.name").toLowerCase().contains("mac") || System.getProperty("os.name").toLowerCase().contains("linux")) { // Mac and Linux
                // Placeholder - Linux/macOS specific commands (e.g., using ProcessBuilder to run shell commands like upower)
                //  This example illustrates using ProcessBuilder to execute a shell command (replace with your actual OS command)
                 ProcessBuilder processBuilder = new ProcessBuilder("upower", "-i", "/org/freedesktop/UPower/devices/battery_BAT0"); // Example
                 Process process = processBuilder.start();
                 // Read output of the command to get battery info (not shown here to keep the example simple)

                System.out.println("Example: Getting battery status on Linux/macOS (using external commands/libraries - full implementation not shown here).");

            } else {
               System.out.println("Getting 'sustainable' info not demonstrated for this OS.");
            }

       } catch (Exception e) {
            System.err.println("Error getting 'sustainable' info: " + e.getMessage());
       }

    }
}
