import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckJavaInstallation {

    public static boolean isJavaInstalled() {
        try {
            Process process = Runtime.getRuntime().exec("java -version");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream())); // Read from error stream for version info
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("java version") || line.startsWith("openjdk version")) {  //Handles different JVM distributions
                    return true;
                }
            }
            return false; //Reached end of stream without finding version info
        } catch (IOException e) {
            return false; //Exception likely means java isn't accessible in PATH
        }
    }

    public static void main(String[] args) {
        if (isJavaInstalled()) {
            System.out.println("Java is installed on your system.");
        } else {
            System.out.println("Java is not installed or not accessible in your system's PATH.");
        }
    }
}

