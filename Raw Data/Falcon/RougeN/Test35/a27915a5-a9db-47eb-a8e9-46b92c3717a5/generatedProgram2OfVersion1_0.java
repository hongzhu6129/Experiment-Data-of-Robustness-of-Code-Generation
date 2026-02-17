public class Main {
    public static void main(String[] args) {
        String inputString = "3.0";

        try {
            double doubleValue = Double.parseDouble(inputString);
            int intValue = (int) doubleValue;
            System.out.println("Integer value: " + intValue);
        } catch (NumberFormatException e) {
            System.out.println("Could not parse as a double: " + inputString);
        }
    }
}

