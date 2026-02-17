public class Main {
    public static void main(String[] args) {
        String input = "3.0";

        try {
            int intValue = Integer.parseInt(input); 
            System.out.println("python tutorial " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("python tutorial " + input + ".python tutorial " + input); // Handling the error as specified
        }
    }
}
