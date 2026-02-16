import java.util.ArrayList;
import java.util.List;

public class RemoveThirdElement {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("orange");
        arrayList.add("grape");
        arrayList.add("kiwi");


        // Check if the list has at least 3 elements before attempting to remove
        if (arrayList.size() >= 3) {
            arrayList.remove(2); // Remove the element at index 2 (third element)

            System.out.println("ArrayList after removing the third element:");
            for (String element : arrayList) {
                System.out.println(element);
            }

        } else {
            System.out.println("ArrayList has fewer than 3 elements. Cannot remove the third element.");
        }


         // Example with an Integer ArrayList
        List<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(10);
        intArrayList.add(20);
        intArrayList.add(30);
        intArrayList.add(40);

        if (intArrayList.size() >= 3) {
             intArrayList.remove(2);

            System.out.println("\nInteger ArrayList after removing the third element:");
            for (Integer element : intArrayList) {
                System.out.println(element); 
            }
        } else {
            System.out.println("\nInteger ArrayList has fewer than 3 elements. Cannot remove the third element.");
        }



    }
}
