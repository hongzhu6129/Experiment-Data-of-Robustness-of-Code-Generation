public class StringToIntConversion {


    public int convertStringToInt(String numStr) {
        try {
            return Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            // Handle the error appropriately
            return -1; // Or throw a custom exception, log the error, etc. 
        }
    }


    public int convertStringToIntOrDefault(String numStr, int defaultValue) {
         try {
            return Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }


    public Integer convertStringToIntOrNull(String numStr) {
        try {
            return Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            return null;
        }
    }


    public static void main(String[] args) {
        StringToIntConversion converter = new StringToIntConversion();

        System.out.println(converter.convertStringToInt("123"));       // Output: 123
        System.out.println(converter.convertStringToInt("anagram"));   // Output: -1

        System.out.println(converter.convertStringToIntOrDefault("456", 0)); // Output: 456
        System.out.println(converter.convertStringToIntOrDefault("invalid", 0)); // Output: 0


        System.out.println(converter.convertStringToIntOrNull("789"));  // Output: 789
        System.out.println(converter.convertStringToIntOrNull("bad_number")); // Output: null



    }
}

