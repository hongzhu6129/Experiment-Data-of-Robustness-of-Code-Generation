import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareSophisticatedLists {

    public static void main(String[] args) {
        // Example usage:
        List<SophisticatedObject> list1 = new ArrayList<>();
        list1.add(new SophisticatedObject("A", 10));
        list1.add(new SophisticatedObject("B", 5));
        list1.add(new SophisticatedObject("C", 20));


        List<SophisticatedObject> list2 = new ArrayList<>();
        list2.add(new SophisticatedObject("C", 20)); // Same as in list1
        list2.add(new SophisticatedObject("B", 5));  // Same as in list1
        list2.add(new SophisticatedObject("A", 10)); // Same as in list1, but different order


        List<SophisticatedObject> list3 = new ArrayList<>();
        list3.add(new SophisticatedObject("A", 10));
        list3.add(new SophisticatedObject("B", 5));
        list3.add(new SophisticatedObject("D", 15)); // Different object


        // 1. Compare ignoring order:
        boolean isEqualIgnoringOrder = compareIgnoringOrder(list1, list2);
        System.out.println("List 1 and List 2 are equal (ignoring order): " + isEqualIgnoringOrder); // Output: true

        isEqualIgnoringOrder = compareIgnoringOrder(list1, list3);
        System.out.println("List 1 and List 3 are equal (ignoring order): " + isEqualIgnoringOrder); // Output: false


        // 2. Compare considering order:
        boolean isEqualConsideringOrder = list1.equals(list2); // Uses the equals() method of List
        System.out.println("List 1 and List 2 are equal (considering order): " + isEqualConsideringOrder); // Output: false

        isEqualConsideringOrder = list1.equals(new ArrayList<>(list1)); // Create a copy for true comparison
        System.out.println("List 1 and its copy are equal (considering order): " + isEqualConsideringOrder); // Output: true


    }

    private static boolean compareIgnoringOrder(List<SophisticatedObject> list1, List<SophisticatedObject> list2) {
        if (list1.size() != list2.size()) {
            return false; 
        }

        // Create copies to avoid modifying the original lists during sorting.
        List<SophisticatedObject> copy1 = new ArrayList<>(list1);
        List<SophisticatedObject> copy2 = new ArrayList<>(list2);


        Collections.sort(copy1); // Sort both lists based on the object's compareTo() method
        Collections.sort(copy2);

        return copy1.equals(copy2);
    }



}



class SophisticatedObject implements Comparable<SophisticatedObject> {
    String name;
    int value;

    public SophisticatedObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SophisticatedObject that = (SophisticatedObject) obj;
        return value == that.value && name.equals(that.name);
    }




    @Override
    public int compareTo(SophisticatedObject other) {
        // Compare by name first, then by value if names are equal
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(this.value, other.value);
    }
}
