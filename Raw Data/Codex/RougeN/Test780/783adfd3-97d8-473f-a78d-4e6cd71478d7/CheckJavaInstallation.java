import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckJavaInstallation {

    public static boolean isJavaInstalled() {
        try {
            // Execute a simple java command (version check)
            Process process = Runtime.getRuntime().exec("java -version");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream())); // Version info is on errorStream

            String line;
            while ((line = reader.readLine()) != null) {
                // Look for a specific string indicating Java presence (adapt as needed)
                if (line.contains("java version") || line.contains("openjdk version")) { 
                    return true;
                }
            }

            // If no "java version" string is found, Java might not be in the PATH. Try "java.exe" (Windows)
            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                process = Runtime.getRuntime().exec("java.exe -version"); // Windows specific
                reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
                while ((line = reader.readLine()) != null) {
                     if (line.contains("java version") || line.contains("openjdk version")) { 
                        return true;
                    }
                }

            }


        } catch (IOException e) {
            // An IOException likely means Java is not installed or accessible
            return false;
        }


        return false; // Java was not detected using these methods
    }

    public static void main(String[] args) {
        if (isJavaInstalled()) {
            System.out.println("Java is installed on this system.");
        } else {
            System.out.println("Java is not installed or not accessible in the system's PATH.");
        }
    }
}
