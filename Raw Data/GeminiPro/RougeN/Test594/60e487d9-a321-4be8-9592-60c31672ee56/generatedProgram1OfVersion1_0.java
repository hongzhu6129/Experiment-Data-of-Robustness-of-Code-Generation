import java.util.LinkedList;

public class RemoveFirstParticular {

    public static void main(String[] args) {
        // Example usage:
        LinkedList<String> myList = new LinkedList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");
        myList.add("apple");
        myList.add("grape");

        String elementToRemove = "apple";

        String removedElement = removeFirstParticular(myList, elementToRemove);

        if (removedElement != null) {
            System.out.println("Removed element: " + removedElement);
            System.out.println("Updated list: " + myList);
        } else {
            System.out.println("Element '" + elementToRemove + "' not found in the list.");
            System.out.println("List remains unchanged: " + myList);

        }



        //Another Test case
        LinkedList<Integer> intList = new LinkedList<>();

        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(20);



        Integer intToRemove = 20;
        Integer removedInt = removeFirstParticular(intList,intToRemove);

         if (removedInt != null) {
            System.out.println("Removed element: " + removedInt);
            System.out.println("Updated list: " + intList);
        } else {
            System.out.println("Element '" + intToRemove + "' not found in the list.");
            System.out.println("List remains unchanged: " + intList);

        }
    }



    private static <T> T removeFirstParticular(LinkedList<T> list, T element) {
        if (list == null || list.isEmpty()) {
            return null; // Handle empty or null list
        }

        for(int i=0; i<list.size(); i++) {
             if(list.get(i).equals(element)) {
                 T removed = list.remove(i);
                 return removed;
             }
        }


        return null; // Element not found
    }
}
