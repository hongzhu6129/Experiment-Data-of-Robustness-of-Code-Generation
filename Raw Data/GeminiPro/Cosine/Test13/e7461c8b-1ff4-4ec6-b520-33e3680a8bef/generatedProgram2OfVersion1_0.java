// ... Inside multiplyBinary()...
try {
    num1 = Integer.parseInt(binary1, 2);
    num2 = Integer.parseInt(binary2, 2);
} catch (NumberFormatException e) {
    System.err.println("Invalid binary input: " + e.getMessage());
    return "Invalid Input"; // Or handle it as needed
}
// ... rest of the function
