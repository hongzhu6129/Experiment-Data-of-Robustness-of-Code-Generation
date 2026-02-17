public class Exercise4 {

 public static void main(String[] args) {
  
    String str = "w3rsource.com";
    System.out.println("Original String : " + str);
        
    // codepoint from index 1 to index 10
    int ctr = str.codePointCount(1, 10);
        
    // prints character from index 1 to index 10
    System.out.println("Codepoint count = " + ctr);
  }
}