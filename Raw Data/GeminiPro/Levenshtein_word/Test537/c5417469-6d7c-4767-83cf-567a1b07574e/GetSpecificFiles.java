import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class GetSpecificFiles {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java GetSpecificFiles <directory_path> <extension1> [<extension2> ...]");
            return;
        }

        String directoryPath = args[0];
        String[] extensions = Arrays.copyOfRange(args, 1, args.length); // Extensions from command-line arguments

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Invalid directory path: " + directoryPath);
            return;
        }

        // Using FilenameFilter with lambda expression for conciseness (Java 8+)
        File[] files = directory.listFiles((dir, name) -> {
            for (String ext : extensions) {
                if (name.toLowerCase().endsWith("." + ext.toLowerCase())) {
                    return true;
                }
            }
            return false; 
        });
        


        if (files != null) {
            for (File file : files) {
                System.out.println(file.getAbsolutePath());
            }
        } else {
            System.out.println("No matching files found.");
        }
    }


   // Alternative implementation using a named inner class for FilenameFilter
    //  Suitable for older Java versions (< Java 8)

/*
 public boolean accept(File dir, String name) {
        for (String ext : extensions) { // extensions would need to be a class member
            if (name.toLowerCase().endsWith("." + ext.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
*/


}
