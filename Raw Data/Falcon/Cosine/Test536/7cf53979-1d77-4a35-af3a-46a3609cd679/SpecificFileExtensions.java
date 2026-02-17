import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class SpecificFileExtensions {

    public static void main(String[] args) {
        // Specify the folder path
        String folderPath = "/path/to/your/folder"; // Replace with your folder path

        // Specify the desired extensions (e.g., ".txt", ".pdf", ".java")
        String[] extensions = {".txt", ".pdf", ".java"};

        File folder = new File(folderPath);

        // Use the FilenameFilter to get specific files
        File[] files = folder.listFiles(new CustomFilenameFilter(extensions));

        if (files != null) {
            for (File file : files) {
                System.out.println(file.getAbsolutePath());
            }
        } else {
            System.out.println("Folder not found or error accessing the folder.");
        }


    }




    // Custom FilenameFilter implementation using the required method signature
    public static class CustomFilenameFilter implements FilenameFilter {
        private final String[] allowedExtensions;

        public CustomFilenameFilter(String[] extensions) {
            this.allowedExtensions = extensions;
        }



        @Override
        public boolean accept(File dir, String name) {
           if (allowedExtensions == null || allowedExtensions.length == 0) {
               return true; // Accept all files if no extensions are specified.

           }
            for (String ext : allowedExtensions) {
                if (name.toLowerCase().endsWith(ext.toLowerCase())) {
                    return true;
                }
            }
            return false;
        }
    }
}
