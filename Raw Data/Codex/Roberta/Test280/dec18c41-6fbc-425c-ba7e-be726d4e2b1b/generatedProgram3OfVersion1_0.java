public static void main(String[] args) {
   // ... (previous code)

   String result = getCurrentDateTime("yyyy/MM/dd");
   assert result.matches("\\d{4}/\\d{2}/\\d{2}") : "Date format incorrect";  // Basic assertion
   System.out.println("Test passed for yyyy/MM/dd");

   // ... More tests ...
}
