public class EnvironmentVariables {

    public static void main(String[] args) {
        String path = System.getenv("PATH");
        String temp = System.getenv("TEMP");
        String username = System.getenv("USERNAME");

        System.out.println("PATH: " + path);
        System.out.println("TEMP: " + temp);
        System.out.println("USERNAME: " + username);


    }
}
