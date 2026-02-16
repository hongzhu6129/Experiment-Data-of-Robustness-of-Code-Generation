public class GetEnvironmentVariables {

    public static void main(String[] args) {

        String path = System.getenv("PATH");
        String pela = System.getenv("PELA"); // Assuming "PELA" is a custom environment variable
        String username = System.getenv("USERNAME"); // Or "USER" on some systems

        if (path != null) {
            System.out.println("PATH: " + path);
        } else {
            System.out.println("PATH environment variable not found.");
        }

        if (pela != null) {
            System.out.println("PELA: " + pela);
        } else {
            System.out.println("PELA environment variable not found.");
        }

        if (username != null) {
            System.out.println("USERNAME: " + username);
        } else {
            System.out.println("USERNAME environment variable not found."); // Or "USER" message
        }
    }
}
