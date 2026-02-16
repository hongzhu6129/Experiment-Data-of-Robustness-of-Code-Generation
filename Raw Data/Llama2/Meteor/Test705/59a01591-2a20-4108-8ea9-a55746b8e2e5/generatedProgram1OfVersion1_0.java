import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseSophisticatedList {

    public static void main(String[] args) {
        // Example usage:

        // Create a list of various types (sophisticated)
        List<Object> sophisticatedList = new ArrayList<>();
        sophisticatedList.add("String Element");
        sophisticatedList.add(123); // Integer
        sophisticatedList.add(45.67); // Double
        sophisticatedList.add(true); // Boolean
        sophisticatedList.add(new CustomObject("Custom Data")); // Custom object


        System.out.println("Original List: " + sophisticatedList);

        // Reverse the list using Collections.reverse()
        Collections.reverse(sophisticatedList); 

        System.out.println("Reversed List: " + sophisticatedList);
    }


    // Example custom object (for demonstration)
    static class CustomObject {
        String data;

        public CustomObject(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "CustomObject{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }
}



