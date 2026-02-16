public class ExtractFirstHalf {

    public static void main(String[] args) {
        String inputString = "pythonpyt";

        if (inputString.length() % 2 == 0) {
            int halfLength = inputString.length() / 2;
            String firstHalf = inputString.substring(0, halfLength);
            System.out.println(firstHalf); 
        } else {
            System.out.println("The input string must have an even number of characters.");
        }
    }
}
