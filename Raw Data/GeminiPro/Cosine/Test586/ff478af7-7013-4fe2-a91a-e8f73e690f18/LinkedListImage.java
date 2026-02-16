import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListImage {

    public static void main(String[] args) {
        // Create a sample linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");


        // Image the elements and their positions using a ListIterator
        System.out.println("Original Linked List:");
        imageLinkedList(linkedList);



        //Mirror the linked list (to demonstrate the "image" concept more visually)
        LinkedList<String> mirroredList = new LinkedList<>();
        ListIterator<String> iterator = linkedList.listIterator(linkedList.size()); // Start from the end

        while (iterator.hasPrevious()) {
            mirroredList.add(iterator.previous());
        }


        System.out.println("\nMirrored Linked List (Image):");
        imageLinkedList(mirroredList);




        // Or, demonstrate "imaging" by printing the list both forwards and backwards 
         //(another interpretation of the somewhat ambiguous prompt):

        System.out.println("\nOriginal List (Forward):");
        imageLinkedListForward(linkedList);

        System.out.println("\nOriginal List (Backward - another image):");
        imageLinkedListBackward(linkedList);


    }



    public static void imageLinkedList(LinkedList<String> list) {
        ListIterator<String> iterator = list.listIterator();
        int position = 0;
        while (iterator.hasNext()) {
            System.out.println("Position: " + position + ", Element: " + iterator.next());
            position++;
        }
    }


    public static void imageLinkedListForward(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position: " + i + ", Element: " + list.get(i));
        }

    }



    public static void imageLinkedListBackward(LinkedList<String> list) {
        for(int i = list.size()-1; i>=0; i--){
             System.out.println("Position (from end): " + (list.size() - 1- i) + ", Element: " + list.get(i)); //Position from end

            //Or, if you want to see position counting backwards from the last element:
            //System.out.println("Position: " + i + ", Element: " + list.get(i));  
        }
    }

}
