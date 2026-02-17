public static void main(String[] args) {

     assert function(0).equals("0");
     assert function(9).equals("9");
     assert function(10).equals("A");
     assert function(255).equals("FF");
     assert function(1234567).equals("BC6147");
     // ... more tests

     System.out.println("All test cases passed!"); // Only prints if no assertions fail
}
