public class CheckSecurityManagerAndEnvVariables {

    public static void main(String[] args) {

        // 31. Check if a Security Manager is established
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            System.out.println("A Security Manager has been established.");
        } else {
            System.out.println("No Security Manager has been established.");
        }

        // 90. Get environment variables
        String path = System.getenv("PATH");
        String pela = System.getenv("PELA"); // Note: "pela" is likely a custom environment variable
        String username = System.getenv("USERNAME"); // Or USER on some systems


        System.out.println("PATH: " + (path != null ? path : "Not set"));
        System.out.println("PELA: " + (pela != null ? pela : "Not set"));
        System.out.println("USERNAME: " + (username != null ? username : "Not set"));
    }
}
