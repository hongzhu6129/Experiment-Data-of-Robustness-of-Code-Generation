import java.util.ArrayList;
import java.util.List;

public class CompareSophisticatedLists {

    public static void main(String[] args) {
        // Example usage:
        List<ComplexObject> list1 = new ArrayList<>();
        list1.add(new ComplexObject("Apple", 10, 1.99));
        list1.add(new ComplexObject("Banana", 5, 0.79));
        list1.add(new ComplexObject("Orange", 8, 0.89));


        List<ComplexObject> list2 = new ArrayList<>();
        list2.add(new ComplexObject("Apple", 10, 1.99));
        list2.add(new ComplexObject("Grape", 12, 2.99)); // Different
        list2.add(new ComplexObject("Orange", 8, 0.89));


        boolean areEqual = compareLists(list1, list2);
        System.out.println("Lists are equal: " + areEqual);


        //Another example - different sizes
        List<ComplexObject> list3 = new ArrayList<>(list1);
        list3.add(new ComplexObject("Mango", 7, 1.29));


        areEqual = compareLists(list1, list3);
        System.out.println("Lists are equal: " + areEqual);


        //Another example: null lists
        areEqual = compareLists(null, list3);
        System.out.println("Lists are equal: " + areEqual);

        areEqual = compareLists(list1, null);
        System.out.println("Lists are equal: " + areEqual);


        areEqual = compareLists(null, null); // Both null - should be considered equal.
        System.out.println("Lists are equal: " + areEqual);
    }


    // Compares two lists of ComplexObject.  Handles nulls and different sizes.
    // Assumes equality is based on the equals() method of the ComplexObject class.
    private static <T> boolean compareLists(List<T> list1, List<T> list2) {
        if (list1 == null && list2 == null) {
            return true; // Both null, consider equal
        }

        if (list1 == null || list2 == null || list1.size() != list2.size()) {
            return false; // One is null or different sizes
        }


        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false; // Elements at the same index are not equal
            }
        }


        return true; // All elements are equal
    }


    private static class ComplexObject {
        String name;
        int quantity;
        double price;


        public ComplexObject(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }


        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            ComplexObject that = (ComplexObject) obj;
            return quantity == that.quantity &&
                    Double.compare(that.price, price) == 0 &&
                    name.equals(that.name); // Assuming String's equals() for name comparison.
        }
    }
}
