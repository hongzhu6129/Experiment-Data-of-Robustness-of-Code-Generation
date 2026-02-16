import java.util.LinkedList;

public class CompareSevenLinkedLists {

    public static void main(String[] args) {
        // Create seven LinkedLists
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();
        LinkedList<Integer> list4 = new LinkedList<>();
        LinkedList<Integer> list5 = new LinkedList<>();
        LinkedList<Integer> list6 = new LinkedList<>();
        LinkedList<Integer> list7 = new LinkedList<>();

        // Populate the lists (example data)
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        list2.add(3);

        list3.add(1);
        list3.add(2);
        list3.add(4); // Different element

        list4.add(1);
        list4.add(2);

        list5.add(1);
        list5.add(2);
        list5.add(3);

        list6.add(1);
        list6.add(2);
        list6.add(3);


        list7.add(1);
        list7.add(2);
        list7.add(3);


        // Compare the lists
        boolean allEqual = true;

        // Efficiently compare all lists to the first list.  If any are not equal to the first, they aren't all equal.
        if (!list1.equals(list2) || !list1.equals(list3) || !list1.equals(list4) || !list1.equals(list5) || !list1.equals(list6) || !list1.equals(list7)) {
            allEqual = false;
        }

        if (allEqual) {
            System.out.println("All seven LinkedLists are equal.");
        } else {
            System.out.println("The seven LinkedLists are not all equal.");
        }


         // More detailed comparison (optional - shows which lists are different)
        System.out.println("Detailed Comparison:");
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2 + (list1.equals(list2) ? " (Equal to List 1)" : " (Not equal to List 1)"));
        System.out.println("List 3: " + list3 + (list1.equals(list3) ? " (Equal to List 1)" : " (Not equal to List 1)"));
        System.out.println("List 4: " + list4 + (list1.equals(list4) ? " (Equal to List 1)" : " (Not equal to List 1)"));
        System.out.println("List 5: " + list5 + (list1.equals(list5) ? " (Equal to List 1)" : " (Not equal to List 1)"));
        System.out.println("List 6: " + list6 + (list1.equals(list6) ? " (Equal to List 1)" : " (Not equal to List 1)"));
        System.out.println("List 7: " + list7 + (list1.equals(list7) ? " (Equal to List 1)" : " (Not equal to List 1)"));




    }
}
