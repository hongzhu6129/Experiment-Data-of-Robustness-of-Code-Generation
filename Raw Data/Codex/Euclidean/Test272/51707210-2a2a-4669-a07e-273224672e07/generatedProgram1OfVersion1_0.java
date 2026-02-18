import java.util.*;

public class PermutationsWithRepetition {

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        char[] arr = str.toCharArray();

        // Sort the array to get all permutations in lexicographic order
        Arrays.sort(arr);

        // Create an empty stack to store the permutations
        Stack<Character> stack = new Stack<>();

        // Create a set to store the visited characters
        Set<Character> visited = new HashSet<>();

        // Iterate over the array
        for (int i = 0; i < n; i++) {
            // If the character is not visited, push it to the stack
            if (!visited.contains(arr[i])) {
                stack.push(arr[i]);
                visited.add(arr[i]);

                // Recursively generate all permutations with the character at the top of the stack
                generatePermutations(arr, n, stack, visited);

                // Pop the character from the stack
                stack.pop();
                visited.remove(arr[i]);
            }
        }
    }

    private static void generatePermutations(char[] arr, int n, Stack<Character> stack, Set<Character> visited) {
        // If the stack is of size n, print the permutation
        if (stack.size() == n) {
            System.out.println(stack);
            return;
        }

        // Iterate over the array
        for (int i = 0; i < n; i++) {
            // If the character is not visited, push it to the stack
            if (!visited.contains(arr[i])) {
                stack.push(arr[i]);
                visited.add(arr[i]);

                // Recursively generate all permutations with the character at the top of the stack
                generatePermutations(arr, n, stack, visited);

                // Pop the character from the stack
                stack.pop();
                visited.remove(arr[i]);
            }
        }
    }
}
