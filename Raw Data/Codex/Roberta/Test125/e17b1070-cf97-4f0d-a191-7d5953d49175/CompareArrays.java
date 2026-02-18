import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareArrays {

    public static void main(String[] args) {
        // Example arrays
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 5, 6, 7, 8};

        // Find common elements (retain)
        List<Integer> commonElements = new ArrayList<>();
        for (int element1 : arr1) {
            for (int element2 : arr2) {
                if (element1 == element2) {
                    commonElements.add(element1);
                    break; // Optimization: once found, no need to check further in arr2
                }
            }
        }

        System.out.println("Common elements (retain): " + commonElements);


        // Find elements present in arr1 but not in arr2 (break - set difference)
        List<Integer> elementsInArr1NotInArr2 = new ArrayList<>();
        for (int element1 : arr1) {
            boolean found = false;
            for (int element2 : arr2) {
                if (element1 == element2) {
                    found = true;
                    break; // Optimization: once found, no need to check further in arr2
                }
            }
            if (!found) {
                elementsInArr1NotInArr2.add(element1);
            }
        }

        System.out.println("Elements in arr1 but not in arr2 (break): " + elementsInArr1NotInArr2);



        // More concise approach using streams (Java 8+) - commented out because the question restricts the answer to using only basic loops/arrays.
        /*
        List<Integer> commonElementsStreams = Arrays.stream(arr1)
                .boxed()
                .filter(x -> Arrays.stream(arr2).boxed().anyMatch(y -> y == x))
                .collect(Collectors.toList());

        List<Integer> diffElementsStreams = Arrays.stream(arr1)
                .boxed()
                .filter(x -> !Arrays.stream(arr2).boxed().anyMatch(y -> y == x))
                .collect(Collectors.toList());

        System.out.println("Common elements (streams): " + commonElementsStreams);
        System.out.println("Elements in arr1 but not in arr2 (streams): " + diffElementsStreams);
        */

    }
}
