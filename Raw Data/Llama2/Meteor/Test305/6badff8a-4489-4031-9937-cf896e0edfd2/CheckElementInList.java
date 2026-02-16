import java.util.List;
import java.util.ArrayList;

public class CheckElementInList {

    public static void main(String[] args) {
        // Example usage:
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(50);

        int elementToFind = 30;

        boolean found = myList.contains(elementToFind);

        if (found) {
            System.out.println(elementToFind + " exists in the list.");
        } else {
            System.out.println(elementToFind + " does not exist in the list.");
        }


        // Another Example with String List
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");

        String stringToFind = "grape";

        boolean stringFound = stringList.contains(stringToFind);

        if (stringFound) {
            System.out.println(stringToFind + " exists in the list.");
        } else {
            System.out.println(stringToFind + " does not exist in the list.");
        }
    }
}
