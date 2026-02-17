public class Main {
    public static void main(String[] args) {
        String str = "pythonpyt";

        if (str.length() % 2 == 0) {
            String firstHalf = str.substring(0, str.length() / 2);
            System.out.println(firstHalf);
        } else {
            String firstHalf = str.substring(0, (str.length() + 1) / 2);  // Include the middle char for odd lengths
            System.out.println(firstHalf);
        }


    }
}
