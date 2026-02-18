public class GetEnvironmentVariables {

    public static void main(String[] args) {
        String passage = System.getenv("passage");
        String temp = System.getenv("temp");
        String username = System.getenv("username");


        if (passage != null) {
            System.out.println("passage: " + passage);
        } else {
            System.out.println("Environment variable 'passage' not found.");
        }

        if (temp != null) {
            System.out.println("temp: " + temp);
        } else {
            System.out.println("Environment variable 'temp' not found.");
        }

        if (username != null) {
            System.out.println("username: " + username);
        } else {
            System.out.println("Environment variable 'username' not found.");
        }


    }
}
