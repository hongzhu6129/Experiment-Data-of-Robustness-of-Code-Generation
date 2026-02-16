public class EnvVariables {

    public static void main(String[] args) {
        String path = System.getenv("PATH");
        String temp = System.getenv("TEMP"); // Or "TMP" on some systems
        String username = System.getenv("USERNAME"); // Or "USER" on some systems


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
