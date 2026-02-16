import java.util.TreeSet;

public class LowerValueElement {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        int givenElement = 35;

        Integer lowerElement = treeSet.lower(givenElement);

        if (lowerElement != null) {
            System.out.println("Element lower than " + givenElement + ": " + lowerElement);
        } else {
            System.out.println("No element found lower than " + givenElement);
        }


        givenElement = 10; // Example with no lower element
        lowerElement = treeSet.lower(givenElement);

        if (lowerElement != null) {
            System.out.println("Element lower than " + givenElement + ": " + lowerElement);
        } else {
            System.out.println("No element found lower than " + givenElement);
        }


        // Example with a custom class (requires implementing Comparable)
         TreeSet<MyClass> myClassTreeSet = new TreeSet<>();
        myClassTreeSet.add(new MyClass(15, "A"));
        myClassTreeSet.add(new MyClass(5, "B"));
        myClassTreeSet.add(new MyClass(25, "C"));
        myClassTreeSet.add(new MyClass(10, "D"));

        MyClass givenMyClass = new MyClass(20, "X");
        MyClass lowerMyClass = myClassTreeSet.lower(givenMyClass);
        if (lowerMyClass != null) {
             System.out.println("MyClass lower than " + givenMyClass + ": " + lowerMyClass);
         } else {
             System.out.println("No MyClass found lower than " + givenMyClass);
         }

    }

    // Example custom class (must implement Comparable)
    static class MyClass implements Comparable<MyClass> {
        int value;
        String label;

        public MyClass(int value, String label) {
            this.value = value;
            this.label = label;
        }

        @Override
        public int compareTo(MyClass other) {
            return Integer.compare(this.value, other.value); // Compare based on 'value'
        }

        @Override
        public String toString() {
            return "{" + value + ", " + label + "}";
        }


    }
}
