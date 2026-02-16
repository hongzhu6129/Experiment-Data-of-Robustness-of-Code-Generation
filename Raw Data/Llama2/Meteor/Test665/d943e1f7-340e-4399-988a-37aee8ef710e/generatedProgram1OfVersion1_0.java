import java.io.File;
import java.io.IOException;

public class CanonicalPath {

    public static void main(String[] args) {
        // Example strings to test
        String[] paths = {
                "/home/./user/../documents/report.txt",
                "/home//user/documents/",
                "/../",
                "/home/user/././",
                "/",
                null,
                ""
        };

        for (String path : paths) {
            try {
                String canonicalPath = getCanonicalPath(path);
                System.out.println("Original Path: " + (path == null ? "null" : "\"" + path + "\""));
                System.out.println("Canonical Path: " + (canonicalPath == null ? "null" : "\"" + canonicalPath + "\""));
                System.out.println();
            } catch (IOException e) {
                System.err.println("Error for path: " + path + ": " + e.getMessage());
            }

        }
    }

    public static String getCanonicalPath(String path) throws IOException {
        if (path == null || path.trim().isEmpty()) {
            return null; // Or handle empty/null as needed
        }
        
        File file = new File(path);
        return file.getCanonicalPath(); 
    }
}
