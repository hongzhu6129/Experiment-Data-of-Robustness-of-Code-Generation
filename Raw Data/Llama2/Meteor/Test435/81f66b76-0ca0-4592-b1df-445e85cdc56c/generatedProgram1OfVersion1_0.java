public class GetEnvironmentVariables {

    public static void main(String[] args) {

        String path = System.getenv("PATH");
        String temp = System.getenv("TEMP"); // Or TMP depending on the OS
        String username = System.getenv("USERNAME"); // Or USER depending on the OS

        System.out.println("PATH: " + path);
        System.out.println("TEMP: " + temp);
        System.out.println("USERNAME: " + username);

        // More robust handling of potential null values:

        if (path != null) {
            System.out.println("PATH: " + path);
        } else {
            System.out.println("PATH environment variable not found.");
        }

        if (temp != null) {
            System.out.println("TEMP: " + temp);
        } else {
            System.out.println("TEMP environment variable not found.");
        }


        if (username != null) {
            System.out.println("USERNAME: " + username);
        } else {
            System.out.println("USERNAME environment variable not found.");
        }

    }
}
