public static void main(String[] args) {

    // Test cases
    int[] testInputs = {0, 7, 10, 255, 1234567, -1, Integer.MAX_VALUE, Integer.MIN_VALUE};
    String[] expectedOutputs = {"0", "7", "A", "FF", "12D687", "FFFFFFFF", "7FFFFFFF", "80000000"}; // Adjust for negative number handling


    for (int i = 0; i < testInputs.length; i++) {
        String result = function(testInputs[i]);
        System.out.println("Input: " + testInputs[i] + ", Result: " + result + ", Expected: " + expectedOutputs[i] + ", Pass: " + result.equals(expectedOutputs[i]));

    }
}
