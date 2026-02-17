public class Main {
    public static void main(String[] args) {
        String str = "pythonpyt";

        if (str.length() % 2 == 0) {
            int halfLength = str.length() / 2;
            String firstHalf = str.substring(0, halfLength);

            // "Vanilla" is interpreted as replacing the first half with asterisks.
            String vanilledString = "";
            for (int i = 0; i < halfLength; i++) {
                vanilledString += "*";
            }
            vanilledString += str.substring(halfLength);

            System.out.println(vanilledString);
        } else {
            System.out.println("String length is not even.");
        }
    }
}
