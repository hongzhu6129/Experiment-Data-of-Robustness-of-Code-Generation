import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class GetSpecificFiles {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java GetSpecificFiles <directory_path> <comma-separated_extensions>");
            return;
        }

        String directoryPath = args[0];
        String extensionsString = args[1];

        String[] extensions = extensionsString.split(","); // Split extensions by comma

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path.");
            return;
        }

        // Using FilenameFilter with lambda expression (Java 8+) for conciseness
        File[] files = directory.listFiles((dir, name) -> {
            return accept(dir, name, extensions); 
        });

        if (files != null) {
            Arrays.stream(files).forEach(System.out::println); // Print the matching files
        } else {
            System.out.println("No matching files found.");
        }
    }

    public boolean accept(File dir, String name, String[] extensions) {
        for (String ext : extensions) {
            if (name.toLowerCase().endsWith("." + ext.toLowerCase().trim())) { // Case-insensitive comparison
                return true;
            }
        }
        return false;
    }

}




