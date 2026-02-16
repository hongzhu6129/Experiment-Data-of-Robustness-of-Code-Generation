import java.util.TreeSet;

public class RemoveYearTreeSet {

    public static void main(String[] args) {
        // Create a TreeSet of Integer objects (representing years)
        TreeSet<Integer> years = new TreeSet<>();

        // Add some sample years
        years.add(2023);
        years.add(2022);
        years.add(2024);
        years.add(2021);

        // Retrieve and remove a specific year (e.g., 2023)
        Integer yearToRemove = 2023;

        if (years.contains(yearToRemove)) {
            System.out.println("Original TreeSet: " + years);

            years.remove(yearToRemove); // Remove the element

            System.out.println("TreeSet after removing " + yearToRemove + ": " + years);
        } else {
            System.out.println(yearToRemove + " is not present in the TreeSet.");
        }




        //Retrieve and remove the first (lowest) year using pollFirst()
        if (!years.isEmpty()) { // Check if the TreeSet is empty to avoid exceptions
             Integer firstYear = years.pollFirst();
             System.out.println("Removed first year (lowest): " + firstYear);
             System.out.println("TreeSet after removing first year: " + years);

        } else {
            System.out.println("TreeSet is empty. Cannot remove first year.");

        }


         //Retrieve and remove the last (highest) year using pollLast()
        if (!years.isEmpty()) { // Check if the TreeSet is empty to avoid exceptions
             Integer lastYear = years.pollLast();
             System.out.println("Removed last year (highest): " + lastYear);
             System.out.println("TreeSet after removing last year: " + years);
        } else {
             System.out.println("TreeSet is empty. Cannot remove last year.");
        }



    }
}
