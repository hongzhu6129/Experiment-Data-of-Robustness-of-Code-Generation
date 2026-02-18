public class ExtractFirstHalf {

    public static void main(String[] args) {
        String str = "pythonpyt";

        if (str.length() % 2 == 0) { // Check if the string length is even
            int halfLength = str.length() / 2;
            String firstHalf = str.substring(0, halfLength);
            System.out.println(firstHalf);
        } else {
            System.out.println("The string is not of even length.");
        }
    }
}
