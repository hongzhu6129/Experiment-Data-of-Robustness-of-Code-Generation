import java.util.LinkedList;

public class CompareLinkedLists {

    public static void main(String[] args) {
        // Create two LinkedLists
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // Populate list1
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Populate list2 -  Case 1: Identical
        list2.add(1);
        list2.add(2);
        list2.add(3);


        System.out.println("Comparison (Case 1: Identical): " + compareLists(list1, list2));


        // Clear list2 and repopulate - Case 2: Different values
        list2.clear();
        list2.add(1);
        list2.add(4);
        list2.add(3);


        System.out.println("Comparison (Case 2: Different Values): " + compareLists(list1, list2));


        // Clear list2 and repopulate - Case 3: Different sizes
        list2.clear();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);


        System.out.println("Comparison (Case 3: Different Sizes): " + compareLists(list1, list2));


         // Clear list2 and repopulate - Case 4: One list empty
        list2.clear();
        

        System.out.println("Comparison (Case 4: List2 Empty): " + compareLists(list1, list2));


        // Clear list1 and list2 - Case 5: Both lists empty
        list1.clear();
        

        System.out.println("Comparison (Case 5: Both Empty): " + compareLists(list1, list2));
    }


    private static boolean compareLists(LinkedList<?> list1, LinkedList<?> list2) {
        // 1. Check if sizes are equal
        if (list1.size() != list2.size()) {
            return false;
        }

        // 2. Iterate and compare elements (if sizes are equal)
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }

        // 3. If all elements are equal and sizes are equal, lists are identical
        return true;
    }
}
