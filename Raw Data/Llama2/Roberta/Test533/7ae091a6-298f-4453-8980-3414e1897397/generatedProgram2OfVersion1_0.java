// ... (rest of the code is the same)

Set<String> uniqueNumbers = new HashSet<>(); // Now a Set of Strings

// ... (inside the loops)
String numberStr = "" + digits[i] + digits[j] + digits[k];
uniqueNumbers.add(numberStr);

// ... (later, to print)
for (String numberStr : uniqueNumbers) {
    System.out.println(Integer.parseInt(numberStr));  // Convert back to int if needed
}
