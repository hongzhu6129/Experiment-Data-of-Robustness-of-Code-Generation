public static void main(String[] args) {
   // ... (rest of your main method)

    String testResult = addBinary("11", "1");
    String expected = "100";
    if (testResult.equals(expected)) {
        System.out.println("Test passed!");
    } else {
        System.out.println("Test failed! Expected: " + expected + ", Got: " + testResult);
    }


}
