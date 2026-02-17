public class Main {
    public static void main(String[] args) {
        String inputString = "3.0";

        try {
            int intValue = Integer.parseInt(inputString); // This line will throw an exception
            System.out.println("Integer value: " + intValue); 
        } catch (NumberFormatException e) {
            System.out.println("python tutorial " + inputString + ".python tutorial " + inputString + " ");
        }
    }
}
