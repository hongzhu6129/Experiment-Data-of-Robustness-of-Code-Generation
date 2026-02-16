import java.util.LinkedList;

public class RemoveLinkedListElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");
        languages.add("C#");

        System.out.println("Initial LinkedList: " + languages);

        // 1. Removing by element value
        String elementToRemove = "C++";
        boolean removed = languages.remove(elementToRemove);  // Returns true if removed, false otherwise
        if (removed) {
            System.out.println("Removed \"" + elementToRemove + "\": " + languages);
        } else {
            System.out.println("\"" + elementToRemove + "\" not found in the list.");
        }


        // Re-add C++ for the next example
        languages.add(2,"C++"); //Adding at a specific index



        // 2. Removing by index
        int indexToRemove = 2; //Removing "C++" again, now by its index.
        try{
            String removedElement = languages.remove(indexToRemove); //Throws IndexOutOfBoundsException if invalid index
            System.out.println("Removed element at index " + indexToRemove + " (\"" + removedElement + "\"): " + languages);

        } catch(IndexOutOfBoundsException e) {
             System.out.println("Invalid index: " + indexToRemove);
        }


        // 3.  Removing the first element (using removeFirst())
          if(!languages.isEmpty()){ //Check if the list is empty to avoid exception
             String firstElement = languages.removeFirst();
             System.out.println("Removed first element (\"" + firstElement + "\"): " + languages);
          } else{
             System.out.println("The list is empty, cannot remove first element.");
          }


        // 4. Removing the last element (using removeLast())

        if (!languages.isEmpty()){
            String lastElement = languages.removeLast();
            System.out.println("Removed last element (\"" + lastElement + "\"): " + languages);
        } else {
           System.out.println("The list is empty, cannot remove last element.");
        }




        // 5.  Removing all elements (using clear()) - usually used at the end
        languages.clear();
        System.out.println("Cleared the LinkedList: " + languages);


        //Important Note about null:
        //LinkedLists can contain null. If you add null and then try to remove(null), it will remove the first occurrence of null. 
        languages.add("Java");
        languages.add(null);
        languages.add("Python");
        languages.add(null);

        System.out.println("List with nulls:" + languages);

        languages.remove(null); //Removes the *first* null

        System.out.println("List after removing first null:" + languages);





    }
}
